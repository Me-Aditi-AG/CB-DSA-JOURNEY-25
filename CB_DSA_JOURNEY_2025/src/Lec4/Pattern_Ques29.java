package Lec4;

import java.util.Scanner;

public class Pattern_Ques29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=N-1;
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
int val=row; // val take inside the loop bcoz after every row change pos1 value is value of that row 
while(j<=num) // Loop for task 2 in first row which is for number
{

if(j==1 || j==num) // Bcoz at pos1 and pos=num of every row is the value of val and between them there is to rpint 0 acc. to pattern
{
System.out.print(val + "\t");
}

else
{
System.out.print("0" +"\t");
}

j++;
}

row++;  // Step3 : Next row prep
System.out.println();
space--;
num+=2;
}
	}

}
