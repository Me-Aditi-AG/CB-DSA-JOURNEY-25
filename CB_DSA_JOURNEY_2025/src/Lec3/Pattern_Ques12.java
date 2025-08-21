package Lec3;
import java.util.*;
public class Pattern_Ques12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
		
Scanner sc= new Scanner (System.in);
int N= sc.nextInt();

int row=1;
int space=N-1;  // In this pattern there are 4 spaces in first so in N terms N-1=5-1=4
int star=1;

while(row<=N) // Step1 : Loop for total no. of rows
{

int i=1;
while(i<=space)  // Loop for task 1 in first row which is for space
{
System.out.print("  ");
i++;
}

int j=1;
while(j<=star)  // Loop for task 2 in first row which is for stars
{

if(j%2==0)   // In this pattern on even position of stars in each line there has to print !
{
System.out.print("! ");
}

else  // To print star on odd position in each line
{
System.out.print("* ");
}
j++;
}

row++;  // Step3 : Next row prep
System.out.println();
space--; // Acc. to pattern space will deccreased by 1 in each line change
star+=2; // Acc. to pattern star will increased by 2 in each line change
}
	}

}
