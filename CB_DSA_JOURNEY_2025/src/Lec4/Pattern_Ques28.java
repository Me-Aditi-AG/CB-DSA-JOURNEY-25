package Lec4;

import java.util.Scanner;

public class Pattern_Ques28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
// For printing number pattern fitrst we print the pattern for star and then acc. to it will change 
//Vertical mirroring use in only number pattern	
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space= N-1;
int num=1;

while(row<=N) // Step1 : Loop for total no. of rows
{

int i=1;
while(i<=space)  // Loop for task 1 in first row which is for space
{
System.out.print("\t");
i++;
}

int j=1;
int val=row; // bcoz after every row change the first number is equal to its row num,ber then acc. to it number will increase 
while(j<=num) // Loop for task 2 in first row which is for number
{
System.out.print(val+"\t"); 

if(j<=num/2) // Vertical mirroring used here bcoz val value increase till col 5 after this its starts decreasing
	         // so vertical mirroring is at col5 
	        // For eg : at row5 vetical mirror is at col5 for vertical mirroring if condition at col4 we increase the val for col5
	        // thats why we use j<=num/2 : at row5 num=9: 9/2=4.5 in int its equals to 4 
	        // here j signifies the col
	       // so till j<=num/2 val will increases after that it starts decreasing
{
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
space--;
num+=2;  // Acc. to pattern num will increased by 2 in each line change

}
	}

}
