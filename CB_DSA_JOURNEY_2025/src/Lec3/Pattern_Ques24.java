package Lec3;

import java.util.Scanner;

public class Pattern_Ques24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 // N=5 which is given in pattern Ques
//For number pattern first we have to print the pattern for stars then acc. to number pattern we will change 

Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=N-1;
int num=1;

while(row<=N) // Step1 : Loop for total no. of rows
{

int i=1;
while(i<=space)  // Loop for task 1 in first row which is for space
{
System.out.print("  ");
i++;
}

int j=1;
while(j<=num) // Loop for task 2 in first row which is for numbers
{
System.out.print(row+" ");  //Acc. to pattern the numbers of each row pattern is equal to the number of row in which pattern is printing at that time
                           // Eg : For row1: the number pattern no. is 1 ; row2 : no. is 2 ; row3 : no.is 3 
                           // And for printing the value of the variabkle we don't use "" double cots
j++;
}

row++;  // Step3 : Next row prep
System.out.println();
space--;
num+=2; // Acc. to pattern number will increased by 2 in each line change
}
	}

}
