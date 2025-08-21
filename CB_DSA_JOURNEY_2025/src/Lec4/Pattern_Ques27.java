package Lec4;

import java.util.Scanner;

public class Pattern_Ques27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
// In number pattern first we have to print the pattern for star then acc. to aptter we will change to pattern
// In numerical pattern we use vertical mirroring too 
// Vertical mirroring at col5

Scanner sc= new Scanner(System.in);
int N=sc.nextInt();

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
int val=1; //We take val inside bcoz after every row change pos1 of each row is 1 after that val start inc and dec
while(j<=num) // Loop for task 2 in first row which is for number
{
System.out.print(val + "\t");

if(j<=num/2) // Vertical Mirroring at col5 
{            // till col5 val value inc after that it start dec
val++;      // So Eg; for row4 there are 7 numbers till j=4 it inc for row4 j<=num/2=j<=7/2=j<=3.5=3
}           // so till j=3 we inc the val bcoz at j3 we do the prep for j4

else
{
val--;
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
