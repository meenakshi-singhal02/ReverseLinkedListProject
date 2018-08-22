package reverselinkedlistproject.reverselinkedlistproject;

public class SumOfReversedLinkedList<T> {
	
	    private Node<T> headElement;
	    
	    //Add elements
	    public void add(T element){
	          
	        Node<T> node = new Node<T>();
	        node.setValue(element);
	        Node<T> tmp = headElement;
	        while(true){
	            if(tmp == null){
	            	headElement = node;
	                break;
	            } else if(tmp.getNextAddress() == null){
	                tmp.setNextAddress(node);
	                break;
	            } else {
	                tmp = tmp.getNextAddress();
	            }
	        }
	    }
	    
	    //Traverse elements
	    public String  traverse()
	    {
	         String  s2="";
	        Node<T> tmp = headElement;
	        while(true){
	            if(tmp == null){
	                break;
	            }	 
	            System.out.print(tmp.getValue()+"\t");
	            s2= s2+String.valueOf(tmp.getValue());
	            tmp = tmp.getNextAddress();
	            
	        }
	        System.out.println();
			return s2;
	    }

	   //Reverse the array  
	    public void reverse(){	         
	        System.out.println("reversing the linked list elements order\n");
	        Node<T> prevElement = null;
	        Node<T> currentElement = headElement;
	        Node<T> nextElement = null;
	        while(currentElement != null){
	            nextElement = currentElement.getNextAddress();
	            currentElement.setNextAddress(prevElement);
	            prevElement = currentElement;
	            currentElement = nextElement;
	        }
	        headElement = prevElement;
	    }

	    public static void main(String a[]){
	    	
	    	//Create First LinkedList
		    	SumOfReversedLinkedList<Integer> firstLinkedList = new SumOfReversedLinkedList<Integer>();
		    	firstLinkedList.add(3);
		        firstLinkedList.add(9);
		        firstLinkedList.add(5);
		        firstLinkedList.add(8);
		        System.out.println();
		        firstLinkedList.traverse();
		        System.out.println();
		        firstLinkedList.reverse();
		        String sumOfFirstLinkedList = firstLinkedList.traverse();
		        System.out.println("\nReversed integer number for first linked list "+sumOfFirstLinkedList);
	        
	        //Create First LinkedList
			    SumOfReversedLinkedList<Integer> secondLinkedList = new SumOfReversedLinkedList<Integer>();
			    secondLinkedList.add(9);
		        secondLinkedList.add(7);
		        secondLinkedList.add(0);
		        secondLinkedList.add(9);
		        System.out.println();
		        secondLinkedList.traverse();
		        System.out.println();
		        secondLinkedList.reverse();
		        String sumOfSecondLinkedList = secondLinkedList.traverse();
		        System.out.println("\nReversed integer number for second linked list "+sumOfSecondLinkedList);
		       
		     //Add both linkedlists 
		        int finalLinkedListSum = Integer.valueOf(sumOfFirstLinkedList)+Integer.valueOf(sumOfSecondLinkedList);
		        System.out.println("\nFinal Linked list sum is "+finalLinkedListSum);
	         
	         //Create final LinkedList to store final values
		        SumOfReversedLinkedList<Integer> finalLinkedList = new SumOfReversedLinkedList<Integer>();
		     
		     //Create Final reversed LinkedList 
		        while (finalLinkedListSum > 0)
			        {
		      		int n1= finalLinkedListSum % 10;
		      		finalLinkedList.add(n1);
		      		finalLinkedListSum = finalLinkedListSum / 10;
			        }
		     
		     //Traverse final linked list	
		      System.out.println("\nreversing the linked list\n");
	          finalLinkedList.traverse();
	          System.out.println();
	}
}

