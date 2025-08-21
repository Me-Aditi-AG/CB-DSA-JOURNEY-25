package Lec4;

import java.util.Scanner;

public class Pattern_Ques30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
 
while(row<=N) // //Loop for total no. of rows
{

int i=1;
int val=N; //bcoz at every row change at pos1 the value pf pos1= the N given in ques then after taht it starts dec thats wbhy it takes inside the loop
while(i<=N) // Loop for task 1 in first row which is for number
{           // i<=N bcoz in each row there coloumns is equal to the given N
System.out.print(val+"\t");
val--; // bcoz val dec after every pos(j) change in row
i++;
}

row++;
System.out.println();
}
	}

}
