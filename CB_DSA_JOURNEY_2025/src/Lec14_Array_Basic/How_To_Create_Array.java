package Lec14_Array_Basic;
import java.util.*;

public class How_To_Create_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Array is a non primitive data type thats why it created and store in heap memory
		
int [] arr= new int[5];  //JVM will come and read first new int[5] and create a array of size in heap memory at some address
                        //Due to int [] arr new 1D array will create whose name is arr and address of 5 size array  created in heap will store in arr

System.out.println(arr); //Due to this we get the address of array created in heap memory
System.out.println(arr.length); //Due to this we get 5 as array length

// In array indexing always start with 0
arr[0]=5;  //Putting value in each bloack of array which is index
arr[1]=4;
arr[2]=10;
arr[3]=9;
arr[4]=11;

System.out.print(arr[0]); //Due to thsi we print the value store in that index of array
System.out.print(arr[1]);
System.out.print(arr[2]);
System.out.print(arr[3]);
System.out.print(arr[4]);


	}

}
