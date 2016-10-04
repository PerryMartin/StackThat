
import java.util.Scanner;

public class MainOfStack {
	
	 
        
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		MrCoxallStack _aJesusStack = new MrCoxallStack();
		String anItem;
		int counter = 0;
		
		
		while (counter < 5) {
			anItem = input.nextLine();
			counter++;
			_aJesusStack.push(anItem);
		}
		
		  
		  
	     
	   
				
		// _aJesusStack.pop(anItem);
				
			
}
	}
