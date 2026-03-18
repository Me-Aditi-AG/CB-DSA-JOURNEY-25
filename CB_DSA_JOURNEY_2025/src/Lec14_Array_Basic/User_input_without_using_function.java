package Lec14_Array_Basic;

import java.util.Scanner;

public class User_input_without_using_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();

		int [] arr= new int[N]; // Taking N as a value of size of array from user

		for(int i=0; i<arr.length; i++) // Due to this we didnt need to write arr[0]=sc.nextInt; and other index to take input
		{                         // We start the loop from 0 bcoz indexing in array starts from 0 and goes to arr.length means whatever N value given by user
		arr[i]=sc.nextInt();    // Due to this it take input for every i till i< arr.length
		}

		
		for(int j=0; j<arr.length;j++)  // To print Array value of each index
		{
		System.out.print(arr[j]);
		}
		
	}

}
