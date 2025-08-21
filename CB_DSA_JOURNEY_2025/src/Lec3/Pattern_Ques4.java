package Lec3;
import java.util.*;
public class Pattern_Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// In star pattern space before star matters but space after star didn't matters

// N=5 which is given in pattern Ques

Scanner sc= new Scanner(System.in);
int N= sc.nextInt();
int row=1;
int space=N-1; // Task do acc. to pattern in first row . Hence first task and loop will be done for space
               // In first row there are 4 spaces . and N value is 5 . so in N terms it will be N-1=5-1=4
int star=1;    // In first row there is 1 star only
while(row<=N)  // Step1 : Loop for total no. of rows
{
int i=1;       // Step2: Loop for task in first row
while(i<=space)   // Acc. to pattern first task in first row is to print space so acc. to that first loop is for space
{
System.out.print(" "+" ");
i++;
}

int j=1;
while(j<=star) // Loop for 2 task in first row which is to print star
{
System.out.print("*"+" ");
j++;
}

row++;  // Step3 : Next row prep
System.out.println();
space--; // Acc. to pattern space will decreased by each line change
star++;  // Acc. to pattern star will inccreased by each line change
}

	}

}
