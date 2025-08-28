package Lec5;

import java.util.Scanner;

public class Using_Break__PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Prime no. means its a no. which is divisible by only 1 and itself.
//Optimize solution of prime no. by using break: statement
//Break statement is used to stop the loop forecfully
		
Scanner sc= new Scanner(System.in);
int N=sc.nextInt();

int i=2;
int fact=0;

while(i<N)
{
	
if(N%i==0)
{
fact++;
break; //Here i use break bcoz as we know prime no.a re those no. which is divisible by 1 and itself 
}     //so if we found any i which divides N that means the no. is not a prime no. so after fact++ we use break due to this whole loop ends
//Then it goes to the if condition of fact>=1 . Here if we found any i which divides N then we don't need to check all the i b/w 2 to N-1 
i++;
}
	
if(fact>=1)
{
System.out.println("Not a prime no.");
}

else
{
System.out.println("Prime no.");
}
	}

}
