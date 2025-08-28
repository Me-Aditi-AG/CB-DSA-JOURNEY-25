package Lec5;

import java.util.Scanner;

public class Sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Here is the solution to find sum of digit of given n
//Eg: N=8936=8+9+3+6=26 : Here 26 will be the output
// Dividing any no. by 10 we got the remainder as last digit and quotient as next N		
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int sum=0; //here sum intialize by 0 outside of teh loop bcoz currently there is no sum if i take thsi inside then sum set to 0 by evry i change

while(N>0) //Loop will work till N>0 bcoz we add digits till no. become 0
{

int rem= N%10; // to find the last digit of every N
sum= sum+rem; // To adding rem as a last digit of every no.
N=N/10; //by dividing any no. by 10 we got the quotient as the next N 
}

System.out.println(sum);
	}

}
