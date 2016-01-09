
public class Node {

	  Node next = null;  // Node reference 
	  int data;          // value at each node
	  
	 //Node Constructor
     public Node(int d){
	     data = d;
	  } 
	 
     
     //Add a node to singly linked list
	void appendToTail(int d){
		 Node end = new Node(d);
		 Node n = this;
			 while (n.next != null) {
				 	n = n.next;
			   }
		 n.next = end;
	 }
	
	
	//Delete a node from a singly linked List
	Node deleteNode(Node head, int d) {
		 Node n = head;
		 
		 // if the first node is the data
		 if (n.data ==d) {
		       return head.next; /* moved head */ 
		  }
		

		while (n.next != null) { 
			if (n.next.data == d) { 
				n.next = n.next.next;
				return head; /* head didn't change */

			}
			n = n.next;
		  }
	    return head;
   }

}
