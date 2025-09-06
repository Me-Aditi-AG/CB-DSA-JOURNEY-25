package Lec6;
import java.util.*;
public class Fibonnaci_series_in_b_term {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Think the code on the basis of which the given N Pos value use wants.No matter what in terms you want to print the fibonnaci value
//Eg: N=6 user wants the fibonnaci value of pos6 which is 8 so we will write code acc. to value 8 and condition weill apply acc.of i<N
		
Scanner sc= new Scanner(System.in);
int N=sc.nextInt();

int a=0;
int b=1;

for(int i=1;i<N;i++) //Acc. to dry run when i=5 then at that time b=8 and we have to print the 8 bcoz 8 is the value at pos6 of fibonnaci series
{
int c=a+b;
a=b;
b=c;

}

System.out.println(b); 

	}

}
