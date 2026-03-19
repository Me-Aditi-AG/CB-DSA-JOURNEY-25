package Lec14_Array_Basic;

public class Another_way_to_solve_max_value_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Using Interger.Min_Value and Math.max(a,b) function to find maximum value in array
		
int[] arr= {3,5,1,7,8};

System.out.println(max(arr));

	}

public static int max(int[]N)
{

int prev= Integer.MIN_VALUE; // Due to this i get the minimum value of integer which is -2^31

for(int i=0;i<N.length;i++) // And then comparing min value of integer with 0th index value of array
{
prev= Math.max(prev, N[i]); // Getting maximum value by comparing prev value and current value of i in prev
}

return prev;
}
}
