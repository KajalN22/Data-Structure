package practice_programs;

public class LinkedList {

	Node head;
	
	  class Node{
		int data;
		Node next;
		
		public Node(int data) {

		this.data=data;
		this.next=null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}	
	}
	
	  //to add the element at first position
	public void addFirst(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	//add element at last
	public void addLast(int data) {

		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.getNext();
		}
		currNode.next=newNode;
	}
	
	//to display the elements
	public void display() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+ " ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	//to find the length of list
	
	public int length() {
		int length=0;
		 Node currNode=head;
		 while(currNode!=null) {
			 length++;
			 currNode=currNode.getNext();
		 }
		
		return length;
		
	}
	
	//driver class
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.addFirst(20);
		l1.display();
		l1.addFirst(40);
		l1.display();
		l1.addFirst(50);
		l1.display();
		
		l1.addLast(80);
		l1.display();
		
		System.out.println(l1.length());
		
		
		
	}

} 