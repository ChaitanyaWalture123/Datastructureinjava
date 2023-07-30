package data_structuresand_algorithms.arrays;

public class ArraysPrint {
	
	void printmyarray(int arr[]) {
		int n = arr.length;
		System.out.println("array is : ");
		for(int i=0;i< n ;i++) {
			System.out.println(arr[i]);
			System.out.println("");
		}
	}
		
	void reverse(int start,int end,int arr[] ) {
		
		
		while(start<end) {
			int tem = arr[start];
			arr[start]=arr[end];
			arr[end]=tem;
			start++;
			end--;
		
		}
		printmyarray(arr);
		
		
	}
	
	void evenremove(int arr[]) {
		int oddcount=0;
		for(int i =0 ; i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddcount++;
				
			}
		}
		int newarr[]=new int[oddcount];
		int index=0;
		for(int i =0 ; i<arr.length;i++) {
			if(arr[i]%2!=0) {
				newarr[index]=arr[i];
				index++;
				
				
			}
		}
		printmyarray(newarr);
		
	}
	
	void minarray(int arr[]) {
		int min=arr[0];
		for(int i =0 ; i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
			
		}
		System.out.println("min element : "+min);
		
	
	
	}
	public int[] resizearray(int arr[],int capacity)
	{
		int rearray[]=new int[capacity];
		for(int i=0;i<capacity;i++)
		{
			rearray[i]=arr[i];
		}
		
		return rearray;
	}

	public static void main(String[] args) {
		ArraysPrint a = new ArraysPrint();
			
		int myarray[]= {8,3,7,4,8,9};
		
		a.printmyarray(myarray);
		
		a.reverse(0,5,myarray);
		
		a.evenremove(myarray);
		
		a.minarray(myarray);
        myarray=a.resizearray(myarray,10);
        System.out.println(myarray.length);
        
	}
	
	

}
