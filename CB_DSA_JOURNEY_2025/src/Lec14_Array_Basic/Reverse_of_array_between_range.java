package Lec14_Array_Basic;

public class Reverse_of_array_between_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int []arr= {3,4,5,6,7,1,2,8,9};

reverse(arr,2,6); // Passing the array address with given range

for(int i=0; i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
	}
public static void reverse(int[]N, int i, int j) // Getting the arr address in N array and i=2 and j=6 
{
while(i<j) // Swapping 
{
int temp= N[i];
N[i]=N[j];
N[j]=temp;
i++;
j--;
}
}
	}


