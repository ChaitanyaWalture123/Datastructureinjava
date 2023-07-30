package data_structuresand_algorithms.linkedlist;

public class LinkesList {
	Node head;
	class Node{
		int data;
		Node next=null;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void addfirst(int data) {
		Node newnode= new Node(data);
		if(head==null) {
			head=newnode;
			return;
			
			
		}
		newnode.next=head;
		head=newnode;
		
	}
	public void addlast(int data) {
		Node newnode= new Node(data);
		if(head==null) {
			head=newnode;
			return;
			
			
		}
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newnode;
	}
	public void printlist() {
	if(head==null) {
		System.out.println("list is empty");
		
	}
	Node current=head;
	while(current!=null) {
		System.out.println(current.data+"-->");
		current=current.next;
	}
	System.out.println("null");
	
	}


	public static void main(String[] args) {
		LinkesList ll = new LinkesList();
		ll.addfirst(3);
		ll.addfirst(6);
		ll.addfirst(9);
		ll.addlast(12);
		ll.printlist();

	}

}
