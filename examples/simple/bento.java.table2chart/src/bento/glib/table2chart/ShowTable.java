package bento.glib.table2chart;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.TableColumn;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
 
public class ShowTable extends JPanel {
 static final long serialVersionUID = -4882524113697767203L;
	private boolean DEBUG = false;
 
    public ShowTable(Resource r) {
        super(new GridLayout(1,0));
 
        EObject mtable = r.getContents().get(0);
        
    	List<EObject> rows = (List<EObject>) mtable.eGet( mtable.eClass().getEStructuralFeature("rows") );
    	
    	EObject firstRow = rows.get(0);
    	List<EObject> firstRowCells = (List<EObject>) firstRow.eGet(firstRow.eClass().getEStructuralFeature("cells") );
    	
        String[] columnNames = new String[firstRowCells.size()];
        int i = 0;
        for (EObject cell : firstRowCells) {
    		EStructuralFeature contentFeature = cell.eClass().getEStructuralFeature("content");
			columnNames[i++] = (String) cell.eGet(contentFeature);
		}
        
        Object[][] data = new Object[rows.size()][firstRowCells.size()];

    	for(i = 1; i < rows.size(); i++) {
    		EObject aRow = rows.get(i);
    		List<EObject> cells = (List<EObject>) aRow.eGet( aRow.eClass().getEStructuralFeature("cells") );
        	
    		EObject firstCol = cells.get(0);
    		EStructuralFeature contentFeature = firstCol.eClass().getEStructuralFeature("content");
        	String  seriesName = (String) firstCol.eGet(contentFeature);
        	
    		for(int j = 0; j < cells.size(); j++) {
        		EObject cell = cells.get(j);
    			String value = (String) cell.eGet( contentFeature );
    			
    			data[i - 1][j] = value;
        	}
    	}

        /*
        String[] columnNames = {"First Name",
                                "Last Name",
                                "Sport",
                                "# of Years",
                                "Vegetarian"};
 
        Object[][] data = {
        {"Kathy", "Smith",
         "Snowboarding", new Integer(5), new Boolean(false)},
        {"John", "Doe",
         "Rowing", new Integer(3), new Boolean(true)},
        {"Sue", "Black",
         "Knitting", new Integer(2), new Boolean(false)},
        {"Jane", "White",
         "Speed reading", new Integer(20), new Boolean(true)},
        {"Joe", "Brown",
         "Pool", new Integer(10), new Boolean(false)}
        };
 		*/
 
        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
 
        if (DEBUG) {
            table.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    printDebugData(table);
                }
            });
        }
 
        /*
        TableColumn column = null;
        for (i = 0; i < columnNames.length; i++) {
            column = table.getColumnModel().getColumn(i);
            if (i == 2) {
                column.setPreferredWidth(100); //third column is bigger
            } else {
                column.setPreferredWidth(50);
            }
            // column.setMinWidth(100);
        }
        */
        
        
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        table.setFillsViewportHeight(true);
        table.setAutoscrolls(true);
        
        //Add the scroll pane to this panel.
        add(scrollPane);
    }
 
    private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();
 
        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI(Resource r) {
        //Create and set up the window.
        JFrame frame = new JFrame("SimpleTableDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        ShowTable newContentPane = new ShowTable(r);
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
    	if ( args.length < 1 ) {
    		System.out.println("Model file expected");
    		return;
    	}
    	
    	//Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(Util.load(args[0]));
            }
        });
    }
}
