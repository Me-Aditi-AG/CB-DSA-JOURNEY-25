package Lec16_Sorting;

public class Arrange_last_element_of_array_in_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[]arr= {1,2,3,4,5,-1};

sort(arr,arr.length-1); // To pass the address of array and last index no. of array in function sort

// Printing of array
for(int i=0; i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
	}

public static void sort(int[]arr, int i)
{

int item= arr[i]; // Storing last index value of array in item

for(int j=i-1;  j>=0 && item<arr[j]; j--) 
{
arr[j+1]= arr[j]; // Swapping if above condition got true
arr[j]= item;
}
}
}
