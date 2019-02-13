package textexcel;

public class SpreadsheetLocation implements Location {
  public SpreadsheetLocation(String cellName) {

  }

  @Override
  public int getRow() {
    return 0;
  }

  @Override 
  public int getCol() {
    return 0;
  }
}
