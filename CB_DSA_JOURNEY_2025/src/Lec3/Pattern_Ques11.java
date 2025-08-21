package Lec3;
import java.util.*;
public class Pattern_Ques11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=N-1;  // Acc. to pattern there are 4 spaces in first row
int star=1;  // Acc. to pattern there are only 1 star in first row

while(row<=N) // Step1 : Loop for total no. of rows
{
	
int i=1;
while(i<=space) // Loop for task 1 in first row which is for space
{
System.out.print("  ");
i++;
}

int j=1;
while(j<=star)  // Loop for task 2 in first row which is for stars
{
if(j%2==0)  // this condition used bcoz on even positions of pattern in each row there is space
{           // Eg : in third row there are 5 positions where some patter have to print but on 2 and 4 positions there is space 
	        // and in 1 and 5 positions there is * thats why if else condition used as odd even 
System.out.print("  ");
}
else
{
System.out.print("* ");
}
j++;
}

row++;  // Step3 : Next row prep
System.out.println();
space--;  // Acc. to pattern space will decreased by 1 in each line change
star+=2; // Acc. to pattern star will increased by 2 in each line change
}
	}

}
