package Lec16_Sorting;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[]arr= {5,3,-7,4,-8,2};

for(int i=0;i<arr.length;i++) // Loop for giving new indexes to give the range
{
int index = minidx(arr,i); // calling function to find the smallest value of array in the given range

//Swapping 
int temp= arr[i];
arr[i]= arr[index];
arr[index]= temp;
}
 // Printing of sorted array
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}

	}

public static int minidx(int[]arr , int index) // Function which return index no. of smallest value of array in the given range
{

int val= index;
for(int i=index+1;i<arr.length;i++)
{
if(arr[i]<arr[val])
{
val=i;
}
}
return val;
}
}
