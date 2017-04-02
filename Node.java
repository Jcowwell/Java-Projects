

public class Node {


	private String value;
	//Node Pointer forward
	private Node nextNode;
	//Node Pointer previous
	private Node prevNode;


	//Getters & Setters methods
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void setNextNode(Node nextNode){
		this.nextNode = nextNode;
	}
	
	public Node getNextNode(){
		return nextNode;
	}
	
	public Node getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}
	
	//To-String method
	public String toString(){
		return value;
		
	}

	
	
}
