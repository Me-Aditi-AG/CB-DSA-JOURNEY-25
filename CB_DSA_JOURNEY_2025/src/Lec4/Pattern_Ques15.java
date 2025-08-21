package Lec4;

import java.util.Scanner;

public class Pattern_Ques15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
// Mirroring line= row5
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=0; 
int star=N;

while(row<=2*N-1)  //Loop for total no. of rows : Here is total 9 rows
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

if(row<N) //Mirroring : Mirror line=row5
{         // Till row 5 star dec and space inc so thats why till row 4 we do star-- and space+=2 bcoz at row4 we do prep for row5
space+=2;
star--;
}

else
{
space-=2;
star++;
}

row++; // Step3 : Next row prep
System.out.println();
}
	}

}
