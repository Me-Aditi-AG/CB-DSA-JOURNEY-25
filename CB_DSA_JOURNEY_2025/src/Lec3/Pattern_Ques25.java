package Lec3;

import java.util.Scanner;

public class Pattern_Ques25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
// For number pattern first we have to print taht pattern for star then according to given no. pattern we will change the star pattern

Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=N-1; 
int star=1;
int val=1; // val=1 taken outside of the loop bcoz if it will taken inside the loop before printing numbers it will always set to 1
           // but we have to increase the value of val by 1 after printing each and every number

while(row<=N)  // Step1 : Loop for total no. of rows
{

int i=1;  // Loop for task 1 in first row which is for space
while(i<=space)
{
System.out.print("\t");
i++;
}

int j=1;
while(j<=star) // Loop for task 2 in first row which is for stars
{
System.out.print(val + "\t"); //we peint the value of val variable bcoz in number pattern the values will print
                              // And we use /t here bcoz it gives 4 spaces due to which allignment gets better bcoz of 2 didgit no. allignment is not good
val++;  // After printing the val variable value then we increase it by 1 and then increase j bcoz for next j already next val value we have
       // Eg for row 2 when j=1 it prints 2 and then we increase val =3 and then j =2 and then loop start and then it prints 3 (pre stored value of val)
j++;
}

row++;  // Step3 : Next row prep
System.out.println();
space--;
star+=2;
}

	}

}
