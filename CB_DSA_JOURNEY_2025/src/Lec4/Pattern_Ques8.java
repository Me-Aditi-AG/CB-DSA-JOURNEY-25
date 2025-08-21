package Lec4;

import java.util.Scanner;

public class Pattern_Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
//Mirroring at row3
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=0;
int star=N;

while(row<=N)  //Loop for total no. of rows
{

int i=1;
while(i<=space) // Loop for task 1 in first row which is for space
{
System.out.print("  ");
i++;
}

int j=1;
while(j<=star) // Loop for task 2 in first row which is for star
{
	
if(j==1 || j==star) // Acc. to pattern at every row's first and last position there is star and in between them there are spaces
{
System.out.print("* ");
}

else
{
System.out.print("  ");
}
j++;
}

if(row<=N/2) //Mirroring at row3
{            // So till row2 we inc space and dec star bcoz at row2 we do prep for row3
space++;
star-=2;
}

else
{
space--;
star+=2;
}

row++; // Step3 : Next row prep
System.out.println();
}
	}

}
