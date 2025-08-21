package Lec4;

import java.util.Scanner;

public class Pattern_Ques33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=10 which is given in pattern Ques
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=N-1;
int num=1;
int count=N; // I take count for keep the track of pos1 variable of every row which is dec by 1 for every row change
             // if i take count inside the loop it will set as same by every row change
while(row<=N)  //Loop for total no. of rows
{
	
int i=1;
while(i<=space) // Loop for task 1 in first row which is for space
{
System.out.print("  ");
i++;
}

int j=1;
int val=count; // here val=count bcoz every row pos1=count value then after that vall inc and dec accordingly for the row
while(j<=num) // Loop for task 2 in first row which is for number
{

if(j==num/2+1) //Acc. to pattern for eg for row3 : num=5: j==num/2+1 : j==5/2+1 : j==2.5+1 :j==3.5 : j==3 
{              // whenever j==3 for row3 it prints 0 otherwise it prints value of val
System.out.print("0 ");
}

else
{
System.out.print(val+" ");
}

if(j<=num/2) // Vertical mirroring at col 10
{            // Eg: in row3 there num=5 : j<=num/2 :j<=2 : till j2 we inc the val bcoz at j2 we do prep for j3
val++;
}

else
{
val--;
}

j++;
}

row++; // Step3 : Next row prep
System.out.println();
count--; // count dec after every row change
space--;
num+=2;

}
	}

}
