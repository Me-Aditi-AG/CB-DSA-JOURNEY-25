package Lec6;

import java.util.Scanner;

public class Whole_Fibonnaci_series_in_a_term {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Printing whole fibonacci series in a term
		
Scanner sc= new Scanner(System.in);
int N=sc.nextInt();

int a=0;
int b=1;

for(int i=1;i<=N;i++)
{
System.out.println(a); //a print inside bcoz to print the a value first bcoz it jols the fibonnaci values 
                       //and also after a=b; then also a stores new upcoming fibonnaci value
int c=a+b;
a=b;
b=c;
}

System.out.println(a); // When i=6 at that time a=5;b=8;c=a+n=13 and then a=b;a=8;b=c;b=13 but due then i=7 and loop will ends
                   //so we didnt able to print inside syso(a) due to which a will print outside of the loop to bcoz 8 already get stores in a 
	}

}
