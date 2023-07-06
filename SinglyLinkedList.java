
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
	
	public void insertAtEnd(int data){
		Node newNode = new Node(data);
		
		if(isEmty()){
			head = newNode;
		}
		else{
			Node current = head;
			while(current.next != null){
				current = current.next;
			}
				current.next = newNode;
		}
		
	}
	
	public void display(){
		
		if(isEmty()){
			System.out.println("List is empty.");
		}
		else{
			
			Node current  = head;
			while(current != null){
				System.out.print(current.data + "  ");
				current=current.next;
			}
			System.out.println();
		}
	}
	
	public int getSize(){
			Node current = head;
			int count = 0;
			while(current != null){
				current=current.next;
				count++;
			}
			return count;
	}
	
	public void insertAtIndex(int index,int data){
		
		if(index<0 || index>getSize()){
			System.out.println("Invalid Index");
			return;
		}
		
		if(index == 0){
			insertAtFront(data);
			return;
		}
		
		int count = 0;
		Node current = head;
		while(index-1 > count){
			current = current.next;
			count++;
		}
		
		Node newNode = new Node(data);
		
		newNode.next = current.next;
		current.next = newNode;
	}
	
	public void deleteAtFront(){
		if(isEmty()){
			System.out.println("List is empty.");
		}
		else{
			head = head.next;
		}
		
	}
	
	//using previous
	
	public void deleteAtEnd(){
		if(isEmty()){
			System.out.println("List is empty.");
		}
		else if(head.next == null){
			head = null;
		}
		else{
			Node current = head;
			Node previous = null;
			while(current.next != null){
				previous = current;
				current = current.next;
			}
			previous.next = null;
		}
	}
	
	//without using previous
	public void deleteAtEnd1(){
		if(isEmty()){
			System.out.println("List is empty.");
		}
		else if(head.next == null){
			head = null;
		}
		else if(head.next.next == null){
			head.next = null;
		}
		else{
			Node current = head;
			while(current.next.next != null){
				current = current.next;
			}
			current.next=null;
		}
	}
	
	public void deleteAtIndex(int index){
		if(index<0 || index > getSize()){
			System.out.println("Invalid Index.");
		}
		if(index == 0){
			deleteAtFront();
		}
		if(index == getSize()-1){
			deleteAtEnd();
		}
		else{
			int count = 0;
			Node current = head;
			while(index-1 > count){
				current = current.next;
				count++;
			}
			current.next = current.next.next;
		}
	}
	
	public void search(int data){
		Node current = head;
		int count =0;
		boolean isHave = false;
		while(count < getSize()){
			if(current.data == data){
				isHave = true;
			}
			else{
				current = current.next;
			}
			count++;
		}
		
		System.out.println(isHave);
	}
}



public class SinglyLinkedList {
	public static void main(String[] args) {
		LinkedListADT linkedList = new LinkedListADT();

		linkedList.insertAtFront(4);
		linkedList.insertAtFront(3);
		linkedList.insertAtFront(2);
		linkedList.insertAtFront(1);

		linkedList.display();

		linkedList.insertAtEnd(5);
		
		linkedList.display();
		
		System.out.println(linkedList.getSize());
		
		linkedList.insertAtIndex(3,10);
		linkedList.display();
		
		linkedList.insertAtIndex(0,19);
		linkedList.display();
		
		linkedList.deleteAtFront();
		linkedList.display();
		
		linkedList.deleteAtEnd();
		linkedList.display();
		
		linkedList.deleteAtEnd1();
		linkedList.display();
		
		linkedList.deleteAtIndex(2);
		linkedList.display();
		
		linkedList.search(10);
	}
}