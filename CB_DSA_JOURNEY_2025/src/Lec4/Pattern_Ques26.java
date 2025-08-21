package Lec4;

import java.util.Scanner;

public class Pattern_Ques26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
// In number pattern first we have to print the pattern for star then acc. to aptter we will change to pattern
		
Scanner sc= new Scanner (System.in);
int N= sc.nextInt();

int row=1;
int space= N-1;
int num=1;

while(row<=N)  //Loop for total no. of rows
{
	
int i=1;
while(i<=space) // Loop for task 1 in first row which is for space
{
System.out.print("\t");
i++;
}

int j=1;
int val=1; // We take val inside the lopp bcoz after every line change at pos1 of every row the val starts from 1 and after that it inc.
while(j<=num) // Loop for task 2 in first row which is for number
{
System.out.print(val+"\t"); // to print the value of val variable 
val++; 
j++;
}

row++;  // Step3 : Next row prep
System.out.println();
space--;
num+=2;
}
	}

}
