package Lec4;

import java.util.Scanner;

public class Pattern_Ques31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// N=5 which is given in pattern Ques
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int count=N; // I take this variable ton print * : and i take this variable outside the loop bcoz if its inside by every row cahnge it will set to the 5 
             // by taking count outside and intialize it by N=5 acc. to pattern.While loop of row<=N working count dec acc. for every row
while(row<=N)  //Loop for total no. of rows
{

int i=1;
int val=N;
while(i<=N) // Loop for task in first row which is for number
{
if(i==count) // whenever i= = count value it prints * otherwise it prints val
{
System.out.print("*" + "\t");
}

else
{
System.out.print(val+"\t");
}
val--;
i++;
}

row++; // Step3 : Next row prep
System.out.println();
count--; // count will dec. for every row change
}
	}

}
