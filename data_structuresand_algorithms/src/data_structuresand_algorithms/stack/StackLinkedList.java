package data_structuresand_algorithms.stack;

public class StackLinkedList {
  static class Node{
	  int data;
	  Node next;
	  Node (int data){
		  this.data=data;
		  this.next=null;
		  
	  }
	  class Stackone{
		  public static Node head;
		  
		  public static void push(int data) {
			  Node newNode = new Node(data);
			  if(head==null) {
				  head=newNode;
			  }
			  newNode.next=head;
			  head=newNode;
			  
		  }
		  
		  public static void pop() {
			  if(head==null) {
				  System.out.println("stack is empty");
			  }
			  
			  int head=head.data;
			  head=head.next;
			  System.out.println("the element"+top+"is poped");
			  
		  }
	  }
  }
	public static void main(String[] args) {
		Stackone s =new Stackone();
		s.push(2);
		s.pop();

	}

}
