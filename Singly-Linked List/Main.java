public class Main {

	public static void main(String[] args) {
	
	//create new empty linked list
		List myList = new List();
	
		//create a list, add a, b and c, print list
		myList.addNewNode("a");
		myList.addNewNode("b");
		myList.addNewNode("c");
		
		//print list
		System.out.println(myList);
		
		// remove c, print list
		myList.delete();
		System.out.println(myList);
		
		//remove b, print list
		myList.delete();
		System.out.println(myList);
		
		//remove a, print list
		myList.delete();
		System.out.println(myList);
		
		//add a, b and c back
		myList.addNewNode("a");
		myList.addNewNode("b");
		myList.addNewNode("c");
		
		// print list
		System.out.println(myList);
		
		//insert x between b and c
		myList.insert("b","x");
		
		//print list
		System.out.println(myList);
	
	}
	
}