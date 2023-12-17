package data_structuresand_algorithms.sort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int arr[]=new int[8];
		
		System.out.println("enter the elements of an array");
		for(int i=0;i<8;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<8;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		for(int i=0;i<8;i++){
			int flag=0;
			for(int j=0;j<8-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
					
				}
				}
				if(flag==0)
					{
					break;
					}
			
			
			
		}
		for(int i=0;i<8;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
				

	}

}
