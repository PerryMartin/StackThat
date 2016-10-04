
import java.util.Scanner;

public class MainOfStack {
	
	 public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		MrCoxallStack _aJesusStack = new MrCoxallStack();
		String anItem = null;
		int counter = 0;
		
		
		while (counter < 5) {
			anItem = input.nextLine();
			counter++;
			_aJesusStack.push(anItem);
		}
		
		  
		  if (counter == 5) {
	     _aJesusStack.pop(anItem);
	     }		
		 
		 _aJesusStack.clear();	
}
	}
