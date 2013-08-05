package examples.flow_diagrams.analysis;
/**
 * It works with PIPE4
 */


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import examples.flow_diagrams.report.Place;
import examples.flow_diagrams.report.ReportFactory;

import pipe.calculations.StateSpaceGenerator;
import pipe.calculations.myTree;
import pipe.io.IncorrectFileFormatException;
import pipe.io.ReachabilityGraphFileHeader;
import pipe.views.MarkingView;
import pipe.views.PetriNetView;

public class ReachabilityGraph {
	
	private State[]      states;	
	private List<State>  unbounded;    // states with some unbounded place
	private List<State>  deadlocks;    // deadlock states 
	private Set<Integer> transitions;  // fired transitions

	/**
	 * calculate the reachability graph of the received net
	 * @throws Exception 
	 */
	public void createFromPN (PetriNetView net) throws Exception {
		if (net==null || !net.hasPlaceTransitionObjects()) 
			throw new Exception ("No Petri net objects defined!");

		// calculate reachability graph of the net ................................................
		
		File reachabilityGraph = new File("results.rg"); 
		try {
			try {
				StateSpaceGenerator.generate(net, reachabilityGraph);
			//}   catch (IOException | OutOfMemoryError | TimelessTrapException | ImmediateAbortException e) {
			}   
			// net seems to be unbounded, let's try to generate the coverability graph
			catch (OutOfMemoryError e) {
				LinkedList<MarkingView>[] markings = net.getCurrentMarkingVector();
                int[] currentMarking = new int[markings.length];
                for (int i=0; i < markings.length; i++) currentMarking[i] = markings[i].getFirst().getCurrentMarking();
                myTree tree = new myTree(net, currentMarking, reachabilityGraph);
			}
			System.gc();

		// parse graph ............................................................................
			
			ReachabilityGraphFileHeader header = new ReachabilityGraphFileHeader();
			RandomAccessFile reachabilityFile;
			try {
				reachabilityFile = new RandomAccessFile(reachabilityGraph, "r");
				header.read(reachabilityFile);
			} 
			catch (IncorrectFileFormatException e1) { throw new Exception("createGraph: incorrect file format on state space file"); } 
			catch (IOException e1)                  { throw new Exception("createGraph: unable to read header file"); }

			int markingSize       = header.getStateArraySize(); 
			int numberStates      = header.getNumStates();
			int numberTransitions = header.getNumTransitions();

			this.unbounded   = new ArrayList<State>();	
			this.deadlocks   = new ArrayList<State>();
			this.transitions = new TreeSet<Integer>();
			this.states      = new State[numberStates];
			
			// read states
			for (int counter=0; counter<numberStates; counter++) { 
				State state = new State(reachabilityFile.readInt(), markingSize);
				for (int counter2=0; counter2<markingSize; counter2++) 
					state.setMarking(counter2, reachabilityFile.readInt());
				reachabilityFile.readBoolean(); // (not used)	
				
				this.states[state.id] = state; // state
				this.deadlocks.add(state);     // deadlock state (initially)
				if (!state.isbounded())        // unbounded state
					this.unbounded.add(state);
			}
			
			// read transitions
			reachabilityFile.seek(header.getOffsetToTransitions());
			for (int counter=0; counter<numberTransitions; counter++) { 
				int fromState    = reachabilityFile.readInt();
				int toState      = reachabilityFile.readInt();
				reachabilityFile.readDouble();   // (not used)
				int idtransition = reachabilityFile.readInt();
				
				if (states[fromState]!=null && states[toState]!=null) {
					states[fromState].addNext(idtransition, states[toState]); // state
					deadlocks.remove(states[fromState]);                      // state 'from' has no deadlock
					transitions.add(idtransition);                            // transition has been fired
				}	
				
				System.out.println(fromState+"--("+idtransition+")-->"+toState);
			}
		}
		catch (Exception e) {
			throw new Exception("ERROR: " + e.getMessage());
		}
		finally {
			if (reachabilityGraph.exists()) reachabilityGraph.delete();
		}
		System.out.println("Deadlocks: "+deadlocks);
	}	
	
	/**
	 * Deadlocks states in the reachability graph
	 */
	public List<State> deadlock () {
		return deadlocks;
	}
	
	/**
	 * States in the reachability graph with some unbounded place
	 */
	public List<State> unbounded () {
		return unbounded();
	}
	
	/**
	 * All states in the reachability graph
	 */
	public List<State> states () {
		return Arrays.asList(states);
	}
	
	/**
	 * All fired transitions in the reachability graph
	 */
	public Set<Integer> transitions() {
		return transitions;
	}
	
	/**
	 * Graph state
	 */
	protected class State {
		private int id;                       // identifier
		private int[] marking;                // marking
		private HashMap<Integer,State> next;  // possible next states (key=transition, value=next state)

		State (int id, int size) {
			this.id = id;
			marking = new int[size];
			next    = new HashMap<Integer,State>();
		}

		public void setMarking (int pos, int value) {
			if (pos>=0 && pos<marking.length)
				marking[pos] = value;
		}
		
		public int[] getMarking () {
			return marking;
		}
		
		public String toString() {
			String str = "";
			for (int value : marking) str += value + ",";
			return id + ": [" + str + "]";
		}

		public void addNext(int idtransition, State state) {
			next.put(idtransition,state);
		}
		
		public HashMap<Integer,State> getNext() {
			return next;
		}
		
		public boolean isbounded() {
			for (int value : marking) 
				if (value == -1)
					return false;
			return true;
		}

		public boolean isdeadlock() {
			return next.isEmpty();
		}
				
	}
}
