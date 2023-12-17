package data_structuresand_algorithms.sort;

import java.util.Scanner;

public class SelectionSort {
	
	

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
		
		
		for(int i=0;i<8;i++) {
			int min=i;
			for(int j=i+i;j<8;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
				
				
			}
			
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
		

	}

}
