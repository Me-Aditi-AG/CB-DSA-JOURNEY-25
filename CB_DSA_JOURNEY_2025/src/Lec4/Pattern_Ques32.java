package Lec4;
import java.util.*;

public class Pattern_Ques32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
//Horizontal Mirroring at row5

Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int num=1;
int val=1; // val take outside of the loop bcoz of every row change val inc or dec
           // if val take inside of the loop by every row change val set to 1
while(row<=2*N-1)  //Loop for total no. of rows
{
	
int i=1;
while(i<=num) // Loop for task  in first row which is for number
{
	
if(i%2==0) // Bcoz at even pos of every row it prints star otherwise its prints value of val
{
System.out.print("* ");
}

else
{
System.out.print(val+" ");
}
i++;
}

if(row<N) //Mirroring at row5
{         // So till row4 we inc val and inc star bcoz at row4 we do prep for row5
val++;
num+=2;
}

else
{
val--;
num-=2;
}

row++; // Step3 : Next row prep
System.out.println();
}

	}

}
