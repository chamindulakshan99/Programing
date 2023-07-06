
class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}




class LinkedListADT{
	Node head;
	
	public LinkedListADT(){
		this.head = null;
	}
	
	public boolean isEmty(){
		return head == null;
	}
	
	public void insertAtFront(int data){
		Node newNode = new Node(data);
		if(isEmty()){
			head = newNode;
		}
		else{
			newNode.next=head;
			head = newNode;
		}
	}
	
	public void display(){
		
		if(isEmty()){
			System.out.println("List is empty.");
		}
		else{
			Node current  = head;
			while(current.next != null){
				System.out.println(current .data);
				current=current .next;
			}
		}
	}
}



public class SinglyLinkedList {
	public static void main(String[] args) {
		LinkedListADT linkedList = new LinkedListADT();

		linkedList.insertAtFront(3);
		linkedList.insertAtFront(2);
		linkedList.insertAtFront(1);

		linkedList.display(); // Output: 1 2 3

		linkedList.insertAtEnd(4);
		linkedList.insertAtEnd(5);

		linkedList.display(); // Output: 1 2 3 4 5

		linkedList.insertAtIndex(10, 2);

		linkedList.display(); // Output: 1 2 10 3 4 5

		linkedList.deleteAtFront();
		linkedList.deleteAtEnd();

		linkedList.display(); // Output: 2 10 3 4
		
		linkedList.deleteAtIndex(2);

		linkedList.display(); // Output: 2 10 4
	}
}