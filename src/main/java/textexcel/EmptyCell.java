package textexcel;
/*A class that implements the provided Cell interface, and represents an empty cell.
 * The implementations of both methods can be extremely simple.
 */
public class EmptyCell implements Cell {
	private String abbText;
	private String fullText;
	public String abbreviatedCellText() {
		return abbText;
	}

	public String fullCellText() {
		return fullText;
	}
}
