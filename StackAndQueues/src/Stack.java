
public class Stack {

	
		Node top;
		
		Object pop() {
	     	if (top != null) {
	        	Object item = top.data; 
	        	top = top.next;
	        	return item;
	        	}
	     	 return null; 
	   	}
	 
		 
		
		 
		 void push(int item) { 
			 Node t = new Node(item);
			 t.next = top;
		      top = t;
	
		 }
		
		 Object peek(){
				return top.data;
		 }

		 Object min(){
			 if(top == null){
				 return null;
			 }
			 
			 int minData = top.data;
			 while(top.next!=null){
				 
				 if(minData >= top.next.data)
					 minData = top.next.data;
				 
                top = top.next;
			 }
			 return minData;
		 }
		 
}
