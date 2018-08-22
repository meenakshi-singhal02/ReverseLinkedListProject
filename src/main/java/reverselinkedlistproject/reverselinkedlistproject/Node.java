package reverselinkedlistproject.reverselinkedlistproject;

//Node class 
	class Node<T> {
	      
	    private T elementValue;
	    private Node<T> nextRefAdd;
	      
	    public T getValue() {
	        return elementValue;
	    }
	    public void setValue(T value) {
	        this.elementValue = value;
	    }
	    public Node<T> getNextAddress() {
	        return nextRefAdd;
	    }
	    public void setNextAddress(Node<T> ref) {
	        this.nextRefAdd = ref;
	    }
	}