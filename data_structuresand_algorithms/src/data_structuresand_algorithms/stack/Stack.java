package data_structuresand_algorithms.stack;

import java.util.Scanner;

class StackCreation{
	int top = -1;
	int k;
	int n= 10;
	int stack[]=new int[n];
	
	void push()
	{
		if(top==(n-1)) {
			System.out.println("overflow condition");
		}
		else
		{
			System.out.println("enter the data");
			Scanner sc = new Scanner(System.in);
			int i=sc.nextInt();
			
			top+=1;
			stack[top]=i;
			System.out.println("items inserted");
		}
	}
	void pop()
	{
		if(top==-1) {
			System.out.println("underflow condition");
		}
		
		else {
			top=top-1;
			System.out.println("items deleted");
		}
	}
	void display() {
		for(int j=top;j>=0;j--) {
			System.out.println(stack[j]);
		}
	}
}
	


public class Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackCreation s =new StackCreation();
		int k;
		do {
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.didplay");
			int d=sc.nextInt();
			switch(d) {
			case 1:
			{
				s.push();
				break;
			}
			case 2:
			{
				s.pop();
				break;
			}
			case 3:
			{
				s.display();
				break;
			}
			
			}System.out.println("enter 1 to continue or 0 to exit");
		
		k=sc.nextInt();
		}while(k!=0);
		

	}

}
