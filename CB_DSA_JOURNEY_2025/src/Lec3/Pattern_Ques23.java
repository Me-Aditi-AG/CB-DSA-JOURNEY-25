package Lec3;

import java.util.Scanner;

public class Pattern_Ques23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
// To print number pattern first we have to print the pattern for star then according to it we will change

Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=N-1;
int num=1;

while(row<=N) // Step1 : Loop for total no. of rows
{

int i=1;
while(i<=space) // Loop for task 1 in first row which is for space
{
System.out.print("  ");
i++;
}

int j=1;
while(j<=num) // Loop for task 2 in first row which is for number
{
System.out.print("1 "); 
j++;
}

row++;  // Step3 : Next row prep
System.out.println();
space--;
num+=2; // Acc. to pattern num will increased by 2 in each line change
}
	}

}
