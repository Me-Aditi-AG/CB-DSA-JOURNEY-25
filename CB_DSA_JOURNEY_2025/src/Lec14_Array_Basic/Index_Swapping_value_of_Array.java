package Lec14_Array_Basic;

public class Index_Swapping_value_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Here we are doing swapping by going to inside the house of arr array
		
		int [] arr= {3,4,5,7,1};

		swap(arr,0,1); // For this we need tp pass the address of array and their index whom values we want to change
		System.out.println(arr[0]);  // Due to this index value swapping we get the swapped values in arr[0] and in arr[1] too
		System.out.println(arr[1]);
			}

		public static void swap(int[] N ,int a,  int b) // we get the arr address in int[]N 
		{                                              // index value of arr[0] in a and arr[1] in b
                                            // a is as N[0] 0th index of N array and b is as N[1] 1th index
		
	    int temp=N[a];     // so here we swapping the index values of N array 
		N[a]=N[b];
		N[b]=temp;

		System.out.println(N[a]);
		System.out.println(N[b]);
		}
	}


