package Lec14_Array_Basic;
import java.util.*;
public class Direct_swapping_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// For swapping in array we need to get in the house of array and then swap then changes will reflect
int [] arr= {3,4,7,9,1};

swap(arr[0],arr[1]);
System.out.println(arr[0]); // but function got terminated after function calling 
System.out.println(arr[1]); //then swapped value of a and b  also got terminated with that
	}     // Due to this swapped value didn't get reflected in array for this we have to swapp in index of arary
  
public static void swap(int a, int b)
{

int temp=a;
a=b;
b=temp;

System.out.println(a); // here we get the swapped value in a which is 4
System.out.println(b); // here we get the swapped value of b which is 3


}
}
