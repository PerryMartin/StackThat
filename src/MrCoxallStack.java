
import java.util.*;


public class MrCoxallStack {

	 private List _aStack = new ArrayList();
		
		
	 public void push(String pushed){
		 
		_aStack.add(pushed);
		System.out.println(_aStack);	
			
	 }
			
	public void pop(String poped){
				
				
		_aStack.remove(poped);
		System.out.println(_aStack);		
				
		
	}
}
