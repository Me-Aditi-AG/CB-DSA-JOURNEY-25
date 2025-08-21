package Lec3;
import java.util.*;
public class Pattern_Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();
int row=1;
int star=1;  // Bcoz in first row there is 1 star
while(row<=N) // Step1: Loop for total no. of rows
{
int i=1;
while(i<=star) // Step2: Loop for task in first row
{
System.out.print("*"+" ");
i++;
}
row++;   // Strep3: Next row prep
System.out.println();
star++;
}


	}

}
