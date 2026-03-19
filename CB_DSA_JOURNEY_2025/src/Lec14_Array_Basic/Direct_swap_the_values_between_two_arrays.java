package Lec14_Array_Basic;

public class Direct_swap_the_values_between_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int [] arr= {3,4,2,1};
int [] other= {1,2,3,4};

swap(arr , other); // Passing the addresses of both arr and other array 
                  //Not their index values if want to get all values of other array in arr 
                 // And all values of arr aray in other we need to swap all index values with each other
                // Means swap arr[0] value with other[0] and same thing with all indexes
System.out.println(arr[0]);
System.out.println(other[0]);
	}

public static void swap(int[]arr , int[]other) // Getting the addresses if arr and other array
{

int[]temp=arr;  // Here we get the swapped values but when this function got terminated all swapped values also get terminated
arr=other;
other=temp;


System.out.println(arr[0]);
System.out.println(other[0]);
}
}
