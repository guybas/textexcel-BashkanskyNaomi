package textexcel;
import java.util.*;
/*Command loop (reading commands, calling the spreadsheet's processCommand method 
 * to process each line of input, printing the String returned from processCommand, 
 * repeating until "quit" is read). 
 * You do not need to actually implement any commands other than quit, 
 * as long as the programs compiles and does not crash.
 */
public class TextExcel {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Write your commands (\"quit\" to quit):\n");
    Spreadsheet sheet = new Spreadsheet();
    
    String command = console.nextLine();
    String returned = sheet.processCommand(command);
    System.out.println(returned);
	boolean running = !returned.equals("stop running");
	
    while (running) {
    	command = console.nextLine();
    	returned = sheet.processCommand(command);
    	System.out.println(returned);
    	running = !returned.equals("stop running");
    }
    
    console.close();
  }
}
