package Lec3;

import java.util.Scanner;

public class Pattern_Ques21_Way1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
// In this pattern due to three tasks in first row so there will be 3 loops task1: star ; task2=space ; task3=star

Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int star=1;  // for task1 in first row there is only one star
int space=2*N-3;  // for task2 in first row there is 7 stars = 2N-3=5*2-3=10-3=7

while(row<=N) // Step1 : Loop for total no. of rows
{

int i=1;   //Loop for first part of pattern
while(i<=star)  // Loop for task 1 in first row which is for stars
{
System.out.print("* ");
i++;
}

int j=1;   //Loop for mid part of pattern
while(j<=space)  // Loop for task 2 in first row which is for space
{
System.out.print("  ");
j++;
}

int k=1;   //Loop for last part of pattern

if(row==N)  // Due to extra star in last row bcoz of condition of k<=star : k<=5 so 5 stars will print in last row but ac.. to pattern there will be only 4 stars
	        // So if we start k from 2 it will goes till 5 but only 4 stars will print 
	       // besides from last row . For all the rows k will star from 1 and there will be no extra star due to the increments of stars in next row prep
		  // besides from last row the increment of star is always less than 5 so k value didnt go to 5 and so there is no chance of printing extra star
{
k=2;
}

while(k<=star)  // Loop for task 3 in first row which is for stars
{
System.out.print("* ");
k++;
}

row++;  // Step3 : Next row prep
System.out.println();
star++;   // Acc. to pattern star will increased by 1 in each line change
space-=2;  // Acc. to pattern space will decreased by 2 in each line change
}
	}

}
