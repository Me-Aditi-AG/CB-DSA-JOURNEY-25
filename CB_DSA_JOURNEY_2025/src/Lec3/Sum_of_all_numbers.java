package Lec3;
import java.util.*; // this is use to use the scanner syntax for taking input from user
                    // here we use * bcoz it access all the classes of util package 
                    // orelse we can use import java .util.Scanner;  // to access Scanner syntax
public class Sum_of_all_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// we use loop instead of if for condition bcoz if will work once for the condition but loop will work until condition got false
		
// program to print sum of all numbers between the number given by user
		

 Scanner sc = new Scanner (System.in); // Mandatory line to take input from user
 int N = sc.nextInt();   // Due to this we take input form user and that value stores in N or we can say that value assign to N
 
 int i=1;
 int sum=0;
 
 while(i<=N)
 {
sum = sum+i;
i =i+1;
 }
 
System.out.println(sum);
	}

}
