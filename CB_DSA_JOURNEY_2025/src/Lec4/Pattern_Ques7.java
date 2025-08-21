package Lec4;

import java.util.Scanner;

public class Pattern_Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
		
Scanner sc=  new Scanner(System.in);
int N= sc.nextInt();

int row=1;
while(row<=N)  //Loop for total no. of rows
{
	
int i=1;
while(i<=N) // Loop for task 1 in first row 
{
	
if(row==1 || row==N) // Acc.to pattern at row1 and row5 there are only stars
{
System.out.print("* ");
}

else
{

if(i==1 || i==N) //Acc. to pattern from row2 to row4 at position 1 and last there are stars
{
System.out.print("* ");
}

else
{
System.out.print("  "); //between pos1 and posN from row1 to row4 there are spaces
}
}
i++;
}

row++; // Step3 : Next row prep
System.out.println();
}
	}

}
