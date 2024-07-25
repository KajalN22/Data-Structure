package com.dsa;

public class LL {
     Node head;
     
	class Node{
		String data;
		Node next;
		
		Node(String data)
		{
        
			this.data=data;
			this.next=null;	
	    }
		
	}
	//add-first
	public void addFirst(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public void adLast(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	
	
	//printList
	public void printList(){
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data + "->");
			currNode= currNode.next;
		}
     
		System.out.println("null");
	}
	
	public static void main(String[] args) {
      // creating empty linked list
		LL list=new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.addFirst("This");
		list.printList();
		list.adLast("List");
		list.printList();

	}

}
