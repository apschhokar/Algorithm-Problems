
public class LinnkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node NewList = createNewLinkedList();
		NewList = NewList.deleteNode(NewList, 5);
	}
	
	public static Node createNewLinkedList(){
		Node linked = new   Node(1);
		linked.appendToTail(2);
		linked.appendToTail(3);
		linked.appendToTail(4);
		linked.appendToTail(5);
		linked.appendToTail(6);		
		linked.appendToTail(7);
		return linked;
	}
	
	

}


	
	
	
	
	