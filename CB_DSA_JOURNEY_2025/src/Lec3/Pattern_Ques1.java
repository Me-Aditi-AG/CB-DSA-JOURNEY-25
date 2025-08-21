package Lec3;

import java.util.*;

public class Pattern_Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
		
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int row=1;  
int star=N;  // bcoz there is 5 star in first row 
while(row<=N)  // Step1: Loop for total no. of rows
  {
int i=1;
while(i<=star)  // Step2: loop for doing task of first row
    {
System.out.print("*"+" ");
i++;
    }
row++;         //Step3: next row prep
System.out.println();
		}
	}

}
