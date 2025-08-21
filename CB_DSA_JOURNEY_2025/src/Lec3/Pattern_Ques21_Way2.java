package Lec3;
import java.util.*;
public class Pattern_Ques21_Way2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques 
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int star=1; // For first part of row1 there is only 1 star
int space= 2*N-3; // For row1 there are 7 stars so in N term it will be 2N-3=2*5-3=10-3=7

while(row<=N) // Step1 : Loop for total no. of rows
{

int i=1;   //Loop for first part of pattern
while(i<=star)  // Loop for task 1 in first row which is for stars
{
System.out.print("* ");
i++;
}

int j=1;   //Loop for mid part of pattern
while(j<=space) // Loop for task 2 in first row which is for space
{
System.out.print("  ");
j++;
}

int k=1;   //Loop for last part of pattern
while(k<=star) // Loop for task 3 in first row which is for stars
{
if(k==N)  // This is bcoz in row5 extra star will print due to condition of k<=star : k<=5 so loop will go till k=5 so it will print 5 stars
	      // but for last part of pattern only 4 stars requried so when loop goes for k=5 then it will print space
	      // Due to this there will be no extra star
{
System.out.print("  ");
}

else
{
System.out.print("* ");
}
k++;
}

row++;
System.out.println();
star++;
space-=2;
}
	}

}
