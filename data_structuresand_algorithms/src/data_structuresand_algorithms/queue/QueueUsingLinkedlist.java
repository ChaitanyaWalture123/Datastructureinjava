package data_structuresand_algorithms.queue;

import java.util.Scanner;

public class QueueUsingLinkedlist {
	Scanner s = new Scanner(System.in);
	
	static class Node{
		int data;
		Node next;
	
	
	Node(int data){
		this.data=data;
		this.next=null;
		
	}}
	Node f=null;
	Node r=null;
	void enqueue() {
		System.out.println("enter the element to be inserted :");
		int i=s.nextInt();
		Node newnode = new Node(i);
		if(r==null && f==null) {
			r=newnode ;
			f=newnode;
		}
		
		else {
			r.next=newnode;
			r=newnode;
		}
	}
	
	void dequeue() {
		if(f==null) {
			System.out.println("underflow :");
		}
		else {
			f=f.next;
		}
	}
	void display() {
		Node temp=f;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		QueueUsingLinkedlist q=new QueueUsingLinkedlist();
		
		
		q.enqueue();
		q.enqueue();
		q.enqueue();
		q.enqueue();
		q.dequeue();
		q.dequeue();
		q.display();
		
	}

}
