package textexcel;
/*Correct implementation for the getRows() and getCols() methods. 
 * None of the other Grid methods will be tested in this checkpoint, 
 * so you may put in whatever dummy implementations you like as long as they compile.
 * Your Spreadsheet constructor should initialize a 2D array of cells 
 * with all elements containing EmptyCell objects.
 */
public class Spreadsheet implements Grid {
	private EmptyCell[][] array;
	public Spreadsheet() {
		array = new EmptyCell[12][20];
	}
	
    public String processCommand(String command) {
    	if (command.equals("quit")) {
    		return "stop running";
    	}
    	return "";
    }

    public int getCols() {
    	return 12;
    }
    
    public int getRows() {
    	return 20;
    }

    public Cell getCell(Location loc) {
    	return null;
    }

    public String getGridText() {
    	return "";
    }
}
