package Lec3;
import java.util.*;
public class Pattern_Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques

Scanner sc= new Scanner(System.in);
int N= sc.nextInt();
int row=1;
int space=0;  // Acc. to task in first row is to print space
int star=N;

while(row<=N)  // Step1 : Loop for total no. of rows
{

int i=1;   // Step2: Loop for task in first row
while(i<=space)  // Acc. to tasks in first row there will be the 1 task is to print space
{
System.out.print(" "+" ");
i++;
}

int j=1;
while(j<=star) // Loop for 2 task in first row which is to print star
{
System.out.print("*"+" ");
j++;
}

row++; // Step3 : Next row prep
System.out.println();
space+=2; // Acc. to pattern space is increasing by 2 in each row
star--;   // Acc. to pattern star is decreased by 1 in each row
}



	}

}
