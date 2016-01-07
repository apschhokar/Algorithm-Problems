import java.util.ArrayList;


public class RemoveDuplicates {

	public  Node removeDuplicates(Node head){
		
	   Node newNode = head;
	   ArrayList<Integer> StoreDuplicates = new ArrayList<Integer>();
	   
	   //Add the first element to our arraylist
	   StoreDuplicates.add(newNode.data);
	   
	   while(newNode.next != null){
		   if(!StoreDuplicates.contains(newNode.next.data)){
			    StoreDuplicates.add(newNode.next.data);
		     }
		   else{
			   if(newNode.next.next == null){
				   newNode.next = null;
				   break;
			   }
			   else{
			      newNode.next = newNode.next.next;
			   }
		   }
		   newNode = newNode.next;
	   }
	  return head;
	}
}
