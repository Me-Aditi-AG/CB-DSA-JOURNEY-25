package Lec4;

import java.util.Scanner;

public class Pattern_Ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
// In star pattern we always use horizontal mirroring only 
// We use mirroring here bcoz till row5 space dec and star inc in pattern 
// But after row5 space inc and star dec
// So in this line mirror line is row5

		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int space=N-1;
int star=1;

while(row<=2*N-1) //Loop for total no. of rows . In this pattern there si 9 rows so 2N-1=2*5-1=10-1=9
{

int i=1;
while(i<=space) // Loop for task 1 in first row which is for space
{
System.out.print("  ");
i++;
}

int j=1;
while(j<=star) // Loop for task 2 in first row which is for number
{
System.out.print("* ");
j++;
}

if(row<N) // Mirroring
	      // row<N bcoz till row<5 space dec and star inc 
	      // we dont use row<=N bcoz when we are at row4 we dec space and inc star for row5 due to next row prep
{
space--;
star++;
}

else 
{
space++;
star--;
}

row++; // Step3 : Next row prep
System.out.println();
}
	}

}
