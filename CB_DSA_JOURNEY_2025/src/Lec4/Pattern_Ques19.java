package Lec4;

import java.util.Scanner;

public class Pattern_Ques19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=7 which is given in pattern Ques
//Mirroring at row4
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int star= N/2+1; // Bcoz at row1 in first part there are 4 stars so in N terms N/2+1=4/2+1=3.5+1=4.5=4
int space= -1;

while(row<=N)  //Loop for total no. of rows
{
	
int i=1;  // Loop for first part
while(i<=star) // Loop for task 1 in first row which is for star
{
System.out.print("* ");
i++;
}

int j=1; //Loop for mid part
while(j<=space) // Loop for task 2 in first row which is for space
{
System.out.print("  ");
j++;
}

int k=1;  // Loop for last part
if(row==1 || row==N) // Bcoz in row1 and row7 there is extra star in last part due loop work 1<=4 and acc. to pattern there will be 3 stars
{
k=2;      // So in row1 and row7 we start k from 2 so 2<=4 so loop will work for 3 times and due to thsi there will be only 3 stars
}

while(k<=star) // Loop for task 3 in first row which is for star
{
System.out.print("* ");
k++;
}

if(row<=N/2) //Mirroring at row4
{            // So till row3 we inc space and dec star bcoz at row3 we do prep for row4
star--;
space+=2;
}

else
{
star++;
space-=2;
}

row++; // Step3 : Next row prep
System.out.println();
}
	}

}
