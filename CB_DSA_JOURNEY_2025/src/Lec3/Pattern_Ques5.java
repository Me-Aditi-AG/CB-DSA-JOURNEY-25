package Lec3;
import java.util.*;
public class Pattern_Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques

Scanner sc= new Scanner(System.in);
int N= sc.nextInt();
int row=1;
int space=0; // Acc. to pattern in first task in each row is to print space 
int star=N;  // Acc. to pattern there are 5 star in first row

while(row<=N)  // Step1 : Loop for total no. of rows
{

int i=1;   // Step2: Loop for 1 task in first row which is to print space
while(i<=space)  // Acc. to pattern in first task in each row is to print space so acc. to that first loop is for space
{
System.out.print("  ");
i++;
}

int j=1;
while(j<=star)   // Step2: Loop for 2 task in first row which is to print stars
{
System.out.print("* ");
j++;
}

row++;  // Step3 : Next row prep
System.out.println();
space++;
star--;


	}

}
}
