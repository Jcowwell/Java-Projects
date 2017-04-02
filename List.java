

public class List {

	//data members
	private Node list;
	private Node current;

	//constructors
	public List(){
		list = null;
	}

	//methods
	public void addNewNode(String nodeValue){
		Node temp = new Node();
		temp.setValue(nodeValue);

		if(list == null){
			list = temp;
		}else{
			current = list;
			while(current.getNextNode() != null){
				current = current.getNextNode();

			}
			//System.out.println(current);
			//here we are at the last node.

			current.setNextNode(temp);
			
		}

	}
	
	public String toString(){
		if(isEmpty()){

			return "List is Empty";

		}
		String result = "";
		current = list;
		while(current.getNextNode() != null){
			result = result + current.getValue() + "\n";
			current = current.getNextNode();
		}
		result = result + current.getValue() + "\n";

		return result;

	}

	//delete helper method.
	public void delete() {
		current = list;
		if(isEmpty()){
			System.out.println("List is Empty");

		} 
		//if only head is in list
		else if (current.getNextNode() == null) {
			list = null;

		}

		else{

			current = list;
			while(current.getNextNode().getNextNode() != null){

				current = current.getNextNode();
			}
			current.setNextNode(null);
		}
	}

	public boolean insert(String nodeValue, String newValue) {
		current = list;
		Node next = new Node();
		Node temp = new Node();

		if(isEmpty()){
			System.out.println("There is no Value equvialent to: " + nodeValue);
			return false;
		} 
		//if head is matched value
		else if (current.getValue() == nodeValue) {
			temp.setValue(newValue);
			temp.setNextNode(current.getNextNode());
			current.setNextNode(temp);
			return true;
		}
		//if matches with other nodes in list
		else {
			while(current.getNextNode() != null){
				current = current.getNextNode();

				if (current.getValue().equals(nodeValue)) {

					temp.setValue(newValue);
					temp.setNextNode(current.getNextNode());
					current.setNextNode(temp);
					return true;
				}
			}
		}
		//if there is no matching node
		System.out.println("There is no Value equvialent to: " + nodeValue);
		return false;
	}

	
	public boolean isEmpty() {
		return list==null;
	}

}