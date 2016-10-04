
import java.util.*;


public class MrCoxallStack<item> {

	 private List<item> _aStack = new ArrayList<item>();
		
		
	 public void push(String pushed){
		 
		_aStack.add((item)pushed);
		System.out.println(_aStack);	
			
	 }
			
	public void pop(String poped){
				
				
		_aStack.remove((item)poped);
		System.out.println(_aStack);		
				
		
	}
	
	public void peek(String peeked){
	
		 _aStack.peek((item)peeked);
		System.out.println(_aStack);	
		
	}
	public void clear(){
		
		_aStack.clear();
		System.out.println(_aStack);
		
	}
	
	
}
