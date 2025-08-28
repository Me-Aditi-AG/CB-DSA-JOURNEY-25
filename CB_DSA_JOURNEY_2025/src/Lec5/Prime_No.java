package Lec5;

import java.util.Scanner;

public class Prime_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Prime no. means it's a no. which is divisible by 1 or itself.
Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int i=2; // here we intialize i by 2 bcoz the no. who is divided by 1 and itself is a prime no.
         //so we are checking the no. b/w 2 to N-1 it the N is divided by any no. of b/w them then its not a prime no.
         //Eg: N=8 : from 2 to 7 if any no. of b/w them divides 8 then its not a prime no.: 2,4 are two factors which divides 8 and ==0 so this no. is not a prime no.
int fact=0; //here we intialize factor by 0 bcoz currently there is no which divides the N

while(i<N) // i<N means loop works for 2 to N-1
{

if(N%i==0) // Here we change i by its increement if any of the i divides N then fact inc and if fact=1 or more than 1 that means not a prime no.
{
fact++;
}
i++;
}

if(fact>=1) // To check if we got any factor from above loop then no. is not a prime no.
{
System.out.println("Not a prime No.");
}

else
{
System.out.println("Prime No.");
}

	}

}
