package Lec16_Sorting;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int [] arr= {-1,-2,1,0,5,4};

insertion_sort(arr);

// Printing the array
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
	}

public static void insertion_sort(int[]arr)
{
for(int i=1; i<arr.length;i++) // i starts with 1st index bcoz for 0th index value array is sorted
{
sort(arr,i); // Passing the i as index number to use the concept of arranging last element in sorted array 
}
}

public static void sort(int[]arr, int i) // Reusing the concept of last element
{

int item= arr[i];

for(int j=i-1; j>=0 && item< arr[j] ;j--)
{
arr[j+1]= arr[j];
arr[j]= item;
}
}
}
