package Lec3;

import java.util.Scanner;

public class Pattern_Ques22_Way2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int star=N;
int space=-1;

while(row<=N) // Step1 : Loop for total no. of rows
{

int i=1;  //Loop for first part of pattern
while(i<=star) // Loop for task 1 in first row which is for stars
{
System.out.print("* ");
i++;
	}

int j=1;   //Loop for mid part of pattern
while(j<=space)   // Loop for task 2 in first row which is for space
{
System.out.print("  ");
j++;
}

int k=1;    //Loop for last part of pattern

while(k<=star)  // Loop for task 3 in first row which is for stars
{
	if(k==N)   // This is bcoz if k=5 then it will print space bcoz if we dont do this it will print * in first row
		       // due to the condition k<=5 in first row bcoz of no space loop will go till k<=5 so automatically star will print
	{
	System.out.print("  ");
	}
	else
	{
		System.out.print("* ");
	}
	k++;
}

row++;   // Step3 : Next row prep
System.out.println();
star--;
space+=2;
}
	}

}
