package data_structuresand_algorithms.linkedlist;

import java.util.Scanner;
class DoublyLinked {

	
	
	class Node{
		
		int data;
		Node next;
		Node previous;
		
		Node(int data) {
			this.data = data;
			this.next=null;
			this.previous=null;
			
		}
		
		
	}
	Node head= null;
	Node tail= null;
	public void creation()
	{
		int data,n;
		Scanner s = new Scanner(System.in);
		do
		{
			System.out.println("enter data");
			data = s.nextInt();
			Node newnode= new Node(data);
			if(head==null) {
				head=newnode;
				tail=newnode;
			}
			else {
				head.previous=newnode;
				newnode.next=head;
				head=newnode;
			}
			System.out.println("Do you want to add data");
			n=s.nextInt();
			
		while(n==1);
		}
	
	void traverse() {
		Node temp=head;
		if(head==null) {
			System.out.println("empty");
			
		}
		else {
			while(temp!=null) {
				System.out.println(temp.data+"-->");
				temp=temp.next;
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		DoublyLinked n = new DoublyLinked();
		n.creation();
		n.traverse();
		
	}

}
