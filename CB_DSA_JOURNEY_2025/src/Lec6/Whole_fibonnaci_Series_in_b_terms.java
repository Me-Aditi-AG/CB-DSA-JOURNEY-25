package Lec6;

import java.util.Scanner;

public class Whole_fibonnaci_Series_in_b_terms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int N=sc.nextInt();

int a=0;
int b=1;

for(int i=1;i<N;i++) // Loop will worik til i=5 bcoz when i=5 : c=a+b; c=3+5=8; then a=b;a=5;b=c;b=8 so loop use till i<N 
{
System.out.println(b);
int c=a+b;
a=b;
b=c;
}

System.out.println(b);
	}

}
