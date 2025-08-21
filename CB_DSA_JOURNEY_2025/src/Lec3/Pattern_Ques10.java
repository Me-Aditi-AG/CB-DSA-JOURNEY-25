package Lec3;
import java.util.*;
public class Pattern_Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques

Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=0;
int star= 2*N-1; // In this pattern there are 9 stars in first so in N terms 2N-1=2*5-1=10-1=9

while(row<=N) // Step1 : Loop for total no. of rows
{

int i=1;   // Loop for task 1 in first row which is for space
while(i<=space)
{
System.out.print("  ");
i++;
}

int j=1;
while(j<=star) // Loop for task 2 in first row which is for stars
{
System.out.print("* ");
j++;
}

row++;  // Step3 : Next row prep
System.out.println();
space++; // Acc. to pattern space will increased by 1 in each line change
star-=2; // Acc. to pattern star will decreased by 2 in each line change
}


	}

}
