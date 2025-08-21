package Lec4;

import java.util.Scanner;

public class Pattern_Ques17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=7 which is given in pattern Ques
//Mirroring at row4
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int star=N/2; // In row1 there are 3 stars. So in N term N/2=7/2=3.5 . In int N=3
int space=1;

while(row<=N)  //Loop for total no. of rows
{

int i=1; //Loop for first part
while(i<=star) // Loop for task1 in first row which is for star
{
System.out.print("* ");
i++;
}

int j=1; //Loop for mid part
while(j<=space) // Loop for task2 in first row which is for space
{
System.out.print("  ");
j++;
}

int k=1; //Loop for last part
while(k<=star) // Loop for task3 in first row which is for star
{
System.out.print("* ");
k++;
}

if(row<=N/2) //Mirroring at row4
{            // So till row3 we dec star and inc space bcoz at row3we do prep for row4
star--;
space+=2;
}

else
{
star++;
space-=2;
}

row++;  // Step3 : Next row prep
System.out.println();
}
	}

}
