import java.util.ArrayList;
import java.util.HashMap;


public class LinkedListOperations {
	
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
	
	
	public int findKthToLastElement(Node head, int d){
		Node newNode = head;
		Node KthNode = head;
		int firstCounter = 1;
		
		while(newNode.next != null){
			firstCounter += 1;
			
            if(firstCounter >d){
            	KthNode = KthNode.next;
			}
			newNode = newNode.next;
		}
		return KthNode.data;
	}
	
	
	public void deleteMiddleNode (Node middleNode){
		if(middleNode.next!= null){
			middleNode.data = middleNode.next.data;
			middleNode.next = middleNode.next.next;
		}
	}
	
	public Node partitionAroundValue(Node linkedList, int d){
		//Node newLinkedList = new Node(linkedList.data);
		Node another =  new Node(linkedList.data);
		another = linkedList;
		
		while(linkedList.next != null){
			if(linkedList.data == d){
				break;
			}
			linkedList = linkedList.next;
		}
		
		Node newHead = linkedList;
		
		while(another.next != null){
		   if(another.data > d ){
			   linkedList = createLinkAfterX(linkedList , another.data);
		   }
		   else if ( another.data < d ){
			   newHead = createNewLink(newHead, another.data);
		   }
		   			
		   another = another.next;
		}
          	return newHead;
	}
	
	
	public Node createNewLink(Node previousLink, int data){
		Node newHead = new Node(data);
		newHead.next = previousLink;
		return newHead;
	}
	
	public Node createLinkAfterX(Node NewLink , int data){
		 Node NewAfterLink = new Node(data);
		 NewLink.next = NewAfterLink;
		 NewAfterLink.next = null;
		return NewAfterLink;
	}
	
	
	public  Node addTwoLinkedListCarry(Node firstLinkedList, Node secondLinkedList , int carry){
            
		if(firstLinkedList == null && secondLinkedList == null){
			return null;
		}
		
		int value = carry;
		
		while(firstLinkedList.next != null && secondLinkedList.next !=null){
		}
		
		

		return secondLinkedList;
	}
	
	public boolean checkForLoopInLinkedList(Node listTobeChecked){
		Node slowRunner = listTobeChecked;
		Node fastRunner = listTobeChecked;
		
		while(fastRunner.next != null && fastRunner !=null){
			fastRunner = fastRunner.next.next;
			slowRunner = slowRunner.next;
			if(slowRunner == fastRunner){
			   return true;
			}
		}
		
		
		return false;
	}
	
	
	
	public  Node addTwoLinkedList(Node firstLinkedList, Node secondLinkedList){
		int firstNumber = 0;
		int firstMultiplyFactor = 1;
		int secondNmber= 0;
		int secondMultiplyFactor = 1;
		int sum;
		
	    firstNumber = 	firstLinkedList.data * firstMultiplyFactor ;
		secondNmber = secondLinkedList.data * secondMultiplyFactor;
		
	    while(firstLinkedList.next != null){
	    	   firstMultiplyFactor = firstMultiplyFactor *10;
	    	   firstNumber += firstLinkedList.next.data *firstMultiplyFactor;
	    	   firstLinkedList = firstLinkedList.next;
	    }
	    
	    
	    while(secondLinkedList.next != null){
	    	   secondMultiplyFactor = secondMultiplyFactor *10;
	    	   secondNmber += secondLinkedList.next.data *secondMultiplyFactor;
	    	   secondLinkedList = secondLinkedList.next;
	    }
		
		sum = firstNumber + secondNmber;
		
		String finalSum = Integer.toString(sum);
		
		Node sumLinkedList = new Node (finalSum.charAt(0));
		for (int i = 1 ; i < finalSum.length() ; i++){
			sumLinkedList.appendToTail(finalSum.charAt(i));
		}
		
		return sumLinkedList;
	}
	
	
	public  Node addTwoLinkedListForward(Node firstLinkedList, Node secondLinkedList){
		int FirstNumber = 0 ;
	    int SecondNumber = 0 ;
	    int sum;
	    
	    int FirstDivideFactor = 1;
	    int  SecondDivideFactor = 1;
	    
	    int lengthofFirstLinkedList = calculateLength(firstLinkedList);
	    int lengthofSecondLinkedList = calculateLength(secondLinkedList);
	    
	    for(int i = 1 ; i < lengthofFirstLinkedList; i++)
	    {
	    	FirstDivideFactor = FirstDivideFactor*10;
	    }
	    
	    for(int i = 1 ; i < lengthofSecondLinkedList; i++)
	    {
	    	SecondDivideFactor = SecondDivideFactor*10;
	    }
	    
	    
	    FirstNumber = FirstDivideFactor *firstLinkedList.data;
	    SecondNumber = SecondDivideFactor * secondLinkedList.data;
	    
	    while(firstLinkedList.next != null){
	    	   FirstDivideFactor = FirstDivideFactor /10;
	    	   FirstNumber += firstLinkedList.next.data *FirstDivideFactor;
	    	   firstLinkedList = firstLinkedList.next;
	    }
	    
	    while(secondLinkedList.next != null){
	    	SecondDivideFactor = SecondDivideFactor /10;
	    	SecondNumber += secondLinkedList.next.data *SecondDivideFactor;
	    	   secondLinkedList = secondLinkedList.next;
	    }
	    
	    sum = FirstNumber + SecondNumber;
	    
	    String finalSum = Integer.toString(sum);
		
		Node sumLinkedList = new Node (finalSum.charAt(0));
		for (int i = 1 ; i < finalSum.length() ; i++){
			sumLinkedList.appendToTail(finalSum.charAt(i));
		}
		
		return sumLinkedList;
	}


	// calculates the length of singly linked list
	public int calculateLength (Node List){
		int counter = 1;		
		while(List.next != null){
			counter +=1;
			List = List.next;
		}
		return counter;
	}
	
	
    public Node reverseLinkedList(Node head){
		
    	// check if head that we received is not nulll itself
    	if(head == null){
    		return null;
    	}
    	
    
    	Node NewList = null;
    	
    	if(head.next!= null){
    		reverseLinkedList(head.next);
    	}
    	else {
    		NewList.appendToTail(head.data);
    	}
    		
    	
           	
		
		return NewList;
	}
	
	
	
	public void checkForPalindromeLinkedList(Node head){
		
		
		
		
	}
	
	
}
