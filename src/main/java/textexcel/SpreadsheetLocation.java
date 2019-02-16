package textexcel;
/*A class that fully implements the Location interface, 
 *and contains a constructor taking a single String parameter (e.g., "D20").
 */
public class SpreadsheetLocation implements Location {
	private String cellName;
	public SpreadsheetLocation(String cellName) {
		this.cellName = cellName;
	}

	public int getCol() {
		return "ABCDEFGHIJKL".indexOf(cellName.charAt(0));
	}

	public int getRow() {
		return Integer.parseInt(cellName.substring(1))-1;
	}
}
