package examples.flow_diagrams.analysis;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import pipe.controllers.PetriNetController;
import pipe.models.PetriNet;
import pipe.utilities.transformers.PNMLTransformer;
import pipe.views.PetriNetView;
import pipe.views.PlaceView;
import pipe.views.TransitionView;
import examples.flow_diagrams.analysis.ReachabilityGraph.State;
import examples.flow_diagrams.report.*;

public class Analysis4FlowDiagrams {
	
	private static String folder = "C:/research/genericity-workspace/pruebas/";
	
	public static void main(String[] args) {
		String  filenet = "c:/proyectos/genericity/genericity.atl.transformations/examples/flow_diagrams/models/net.xml";
		/*filenet = "c:/proyectos/genericity/genericity.atl.transformations/examples/flow_diagrams/pruebas/pruebas/test_deadlock.xml";
		filenet = "c:/proyectos/genericity/genericity.atl.transformations/examples/flow_diagrams/pruebas/pruebas/test_deadlock_car.xml";
		filenet = "c:/proyectos/genericity/genericity.atl.transformations/examples/flow_diagrams/pruebas/pruebas/test_deadlock2.xml";
		filenet = "c:/proyectos/genericity/genericity.atl.transformations/examples/flow_diagrams/pruebas/pruebas/test_parallel.xml";*/
		filenet = folder+"test_deadlock_car.xml";
		if ( args.length > 0 ) {
			filenet = args[0];
		}
		
	
		// STEP 1: is the net a WF-net?
		//         (i)  it has one input and one output place exactly
		//         (ii) the extended net (connecting the output to the input place) is strongly connected,
		//              i.e. between every two nodes (places or transitions) there is a connected path
		
		// STEP 2: if the net is a WF-net, is the extended net live and bounded?
		
		// STEP 3: if the net is not a WF-net, or 
		//         if the net is a WF-net but its extension is not bound or live,
		//         then we calculate the reachability/coverability graph of the net

		try {			
			Analysis4FlowDiagrams a4fd = new Analysis4FlowDiagrams(filenet);
			
			// three properties for soundness
			a4fd.hasOptionToComplete();
			a4fd.hasProperCompletion();
			a4fd.hasNoNeedlessElements();
			a4fd.saveResource();
			System.out.println("end");
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// now we save the report		
	}
	
	private String            filenet     = null;
	private PetriNetView      net         = null;  // petri net
	private List<PlaceView>   finalplaces = null;  // final places in the petri net
	private ReachabilityGraph rgraph      = null;  // reachability graph
	private List<State>       finalstates = null;  // final states in the reachability graph (deadlock + final place reached)
	private Report            report;			   // the report to be written
	private Resource          reportResource;
	
	public Analysis4FlowDiagrams (String filenet) {
		this.filenet = filenet;
		
		ResourceSet rs = new ResourceSetImpl();
		String fileName = filenet.replace(".xml", ".report");
		this.reportResource = EMFHelper.createAndAddResource(fileName, new String[] {"report", "xmi"}, rs);
		this.report = ReportFactory.eINSTANCE.createReport();
		this.reportResource.getContents().add(this.report);		
	}
	
	private void saveResource() {
		EMFHelper.saveResource(this.reportResource);
	}
	
	/**
	 * Option to complete: For every state that is reachable from the initial
	 * state, there must be possible to reach a final state. 
	 * @throws Exception 
	 */
	public void hasOptionToComplete () throws Exception {
		init (); 
		
		// states that reach a final state
		List<State> maycomplete = new ArrayList<State>(finalstates);
		for (int i=0; i<maycomplete.size(); i++) {			
			for (State state : rgraph.states())
				if (state.getNext().containsValue(maycomplete.get(i)) && !maycomplete.contains(state))
					maycomplete.add(state);
		}
		
		// states that do not reach a final state (all / maycomplete)
		for (State state : rgraph.states())
			if (!maycomplete.contains(state)) {
				System.out.println("ERROR no option to complete: the diagram may reach state " + toString(state) + ", which cannot be completed");
				
				NoOptionToComplete no2c = ReportFactory.eINSTANCE.createNoOptionToComplete();
				no2c.setProblemKind(ProblemKind.ERROR_LITERAL);
				examples.flow_diagrams.report.State errState = ReportFactory.eINSTANCE.createState();
				//List<examples.flow_diagrams.report.report.Place> places = state.marking2Place();
				errState.getPlaces().addAll(marking2Places(state));
				no2c.getStates().add(errState);
				this.report.getErrors().add(no2c);
			}
	}
	
	/**
	 * Proper completion: when the simulation terminates, only the final place
	 * has tokens and all other places are empty.
	 * @throws Exception 
	 */
	public void hasProperCompletion () throws Exception {
		init ();  
		
		// for all deadlocks in the reachability graph...
		for (State state : rgraph.deadlock()) {
		// ... at least one final place must have been reached
		//     TODO: hasOptionToComplete subsumes this checking, and therefore it can be removed	
			if (!finalstates.contains(state)) {
				System.out.println("ERROR no proper completion: the execution of the diagram may finish without reaching a final state --> active nodes = " + toString(state));
				NoProperCompletion no2c = ReportFactory.eINSTANCE.createNoProperCompletion();
				no2c.setProblemKind(ProblemKind.WARNING_LITERAL);
				examples.flow_diagrams.report.State errState = ReportFactory.eINSTANCE.createState();
				no2c.getStates().add(errState);
				errState.getPlaces().addAll(this.marking2Places(state));
				this.report.getErrors().add(no2c);
			}
		// ... only the final places may have tokens 
			else {
				boolean finalIsTerminating = false;
				List<PlaceView>     errors = new ArrayList<PlaceView>();
				int[]              marking = state.getMarking();
				for (int idplace=0; idplace<marking.length; idplace++) {
					if (marking[idplace]!=0) {
						PlaceView place = this.net.getPlace(idplace);
						//PlaceView place = getPlace(idplace);
						if (isTerminating(place)) finalIsTerminating = true;
						if (!isFinal(place) && !isControl(place)) errors.add(place);
					}
				}
				if (!errors.isEmpty()) {					
					NoProperCompletion no2c = ReportFactory.eINSTANCE.createNoProperCompletion();
					no2c.setProblemKind(ProblemKind.WARNING_LITERAL);
					examples.flow_diagrams.report.State errState = ReportFactory.eINSTANCE.createState();
					//List<examples.flow_diagrams.report.report.Place> places = state.marking2Place();					
					String errorlevel = finalIsTerminating? "WARNING" : "ERROR"; // just warning if final place is terminating
					for (PlaceView place : errors) {
						System.out.println(errorlevel + " no proper completion: the execution of the diagram may finish without completing " + place.getName() + " --> active nodes = " + toString(state));
						Place p = ReportFactory.eINSTANCE.createPlace();
						p.setName(place.getName());
						errState.getPlaces().add(p);
					}
					no2c.getStates().add(errState);
					this.report.getErrors().add(no2c);
				}
			}
		}
		
/*		// for all final states in the reachability graph...
		for (State state : finalstates) {
			int[] marking        = state.getMarking();
			boolean finalReached = false;
			for (int idplace=0; idplace<marking.length; idplace++) {
				// ...only the final places may have tokens
				if (marking[idplace]!=0) {
					PlaceView place = getPlace(idplace);
					if (isFinal(place)) finalReached = true;
					// if final place is     terminating this is an error  (activity diagram)
					// if final place is not terminating this is a warning (BPMN)
					else System.out.println((isTerminating(place)?"WARNING":"ERROR") + " no proper completion: the execution of the diagram may finish without completing " + place.getName() + " --> active nodes = " + toString(state));
				}
			}
			// at least one final place must have been reached 
			if (finalReached==false) System.out.println("ERROR no proper completion: the execution of the diagram may finish without reaching a final state  --> active nodes = " + toString(state));
		}
*/	}
	
	/**
	 * No needless elements: all places/transitions are executed in some 
	 * execution path.
	 * @throws Exception 
	 */
	public void hasNoNeedlessElements () throws Exception {
		init ();
		
		HasNeedlessElements hne = null;
		
		// all places will have eventually a token
		int numplaces = net.getPlacesArrayList().size();
		for (int idplace=0; idplace<numplaces; idplace++) {
			boolean reached = false;
			for (State state : rgraph.states())
				if (state.getMarking()[idplace] != 0) { 
					reached = true;
					break;
				}
			if (!reached) {				
				System.out.println("ERROR needless element: " + getPlace(idplace).getName());
				if (hne == null) ReportFactory.eINSTANCE.createHasNeedlessElements();
				Place p = ReportFactory.eINSTANCE.createPlace();
				p.setName(getPlace(idplace).getName());
			}
		}
		
		// all transitions will be eventually fired
		for (TransitionView transition : net.getTransitionsArrayList())
			if (!rgraph.transitions().contains(Integer.parseInt(getIdTransition(transition)))) {
				System.out.println("ERROR needless element: " + transition.getName());
				if (hne == null) ReportFactory.eINSTANCE.createHasNeedlessElements();
				Transition t = ReportFactory.eINSTANCE.createTransition();
				t.setName(transition.getName());
			}
		
		if (hne!=null) 
			this.report.getErrors().add(hne);
		
	}
	
	/**
	 * Build petri net from file, and corresponding reachability graph.
	 * @throws Exception 
	 */
	private void init () throws Exception {
		if (net==null) {			
			// petri net
			net    = new PetriNetView(new PetriNetController(), new PetriNet());
			net.createFromPNML(new PNMLTransformer().transformPNML(filenet));
			// final places in the petri net: all mandatory places, and if there is none, then all places without output arcs
			finalplaces = new ArrayList<PlaceView>();
			for (PlaceView place : net.places())
				if (place.getName().matches("Final *Mandatory"))
					finalplaces.add(place);
			if (finalplaces.isEmpty())
				for (PlaceView place : net.places())
					if (place.getModel().outboundArcs().isEmpty())
						finalplaces.add(place);
			// reachability graph
			rgraph = new ReachabilityGraph();
			rgraph.createFromPN(net);
			// final states in the reachability graph (deadlock + final place reached)
			finalstates = new ArrayList<State>(); 
			for (State state : rgraph.deadlock()) 
				for (PlaceView place : finalplaces)
					if (state.getMarking()[Integer.parseInt(getIdPlace(place))]!=0) {
						finalstates.add(state);
						break;
					}
		}
	}
	
	/**
	 * It returns whether a place is final 
	 */
	private boolean isFinal (PlaceView place) {
		return finalplaces.contains(place);
	}
	
	/**
	 * It returns whether a place is final and terminating 
	 */
	private boolean isTerminating (PlaceView place) {
		return place.getName().matches("Final Terminating*");
	}
	
	/**
	 * It returns whether a place is a control place (associated to terminating places) 
	 */
	private boolean isControl (PlaceView place) {
		return place.getName().matches("Control");
	}
	
	/**
	 * It returns the place with a given id
	 */
	private PlaceView getPlace (int idplace) {
		//return net!=null? net.getPlaceById("Place"+idplace) : null;
		return net!=null? net.getPlace(idplace) : null;
	}

	/**
	 * It returns the identifier of a place
	 */
	private String getIdPlace (PlaceView place) {
		return place!=null? place.getId().replace("Place", "") : null; 
	}
	
	/**
	 * It returns the transition with a given id
	 */
	private TransitionView getTransition (int idtransition) {
		return net!=null? net.getTransitionById("Transition"+idtransition) : null;
	}

	/**
	 * It returns the identifier of a transition
	 */
	private String getIdTransition (TransitionView transition) {
		return transition!=null? transition.getId().replace("Transition", "") : null; 
	}
	
	/**
	 * It returns the string representation of a net state
	 */
	private String toString (State state) {
		String str = "";
		
		int[] marking = state.getMarking();
		for (int idplace=0; idplace<marking.length; idplace++) 
			if (marking[idplace]!=0)
				str += "," + getPlace(idplace).getName();
		
		return "{" + (str.isEmpty()? str : str.substring(1)) + "}";
	}
	
	private List<Place> marking2Places(State s) {
		List<Place> ret = new ArrayList<Place>();
		int[] marking = s.getMarking();
		for (int idplace=0; idplace<marking.length; idplace++)
			if (marking[idplace]!=0) {
				Place p = ReportFactory.eINSTANCE.createPlace();
				p.setName(this.getPlace(idplace).getName());
				ret.add(p);
			}
		return ret;
	}
}
