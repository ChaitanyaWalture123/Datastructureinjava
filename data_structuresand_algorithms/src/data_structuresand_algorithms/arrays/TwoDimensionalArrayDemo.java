package data_structuresand_algorithms.arrays;

import java.util.Scanner;

public class TwoDimensionalArrayDemo {
	
	public static void main(String[] args) {
		int arr[][]=new int[3][2];
		Scanner s= new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				 System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	int arrr[][]=new int[3][];
	 arrr[0]= new int[2];
	 arr[1]=new int [1];
	 arr[2]=new int [3];
	 for(int i=0;i<arrr.length;i++) {
			for(int j=0;j<arrr[i].length;j++) {
				arr[i][j]=s.nextInt();
			}
	 }
	 for(int i=0;i<arrr.length;i++) {
			for(int j=0;j<arrr[i].length;j++) {
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
	 }
			
			
			}
		}
	
	


