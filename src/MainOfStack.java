
import java.util.Scanner;

public class MainOfStack {
	
	 
        
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		MrCoxallStack _aJesusStack = new MrCoxallStack();
		String anItem;
		
		
		
		  anItem = input.nextLine();
		  
		  try {
				
			   _aJesusStack.push(anItem);
			  
				
				
			} finally {
				
				 _aJesusStack.pop(anItem);
				
			}
	}
}
