package data_structuresand_algorithms.queue;

import java.util.Scanner;

public class Queue {
	 int n=10;
	 int f=-1;
	 int r=-1;
	 int arr[]=new int[n];
	 Scanner s = new Scanner(System.in);
	void enqueue() {
		System.out.println("Enter the element to be inserted");
		int i =s.nextInt();
		
		if(r==n-1) {
			System.out.println("queue overflow");
		}
		else {
		if(f==-1 && r==-1) {
			f=0;
			r=0;
			arr[r]=i;
		}
		else {
			
			r++;
			arr[r]=i;
			
		}
	}
	}
	
	void dequeue() {
		if(r==-1 && f==-1) {
			System.out.println("queue is empty :");
		}
		else {
			f=f+1;
			
		}
	}
	
	void display() {
		for(int i=f;i<=r;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue();
		q.enqueue();
		q.enqueue();
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();

	}

}
