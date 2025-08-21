package Lec4;

import java.util.Scanner;

public class Pattern_Ques18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=7 which is given in pattern Ques
//Mirroring at row4
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space= N/2+1;  // In row1 there are 4 space. So in N term N/2+1=7/2+1=3.5+1=4.5=4
int star=1;

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
System.out.print("* ");
j++;
}

if(row<=N/2) //Mirroring at row4
{           // So till row3 we dec space and inc star bcoz at row3 we do prep for row4
space--;
star+=2;
}

else
{
space++;
star-=2;
}

row++;  // Step3 : Next row prep
System.out.println();
}
	}

}
