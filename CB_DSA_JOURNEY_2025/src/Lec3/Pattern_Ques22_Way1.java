package Lec3;

import java.util.*;

public class Pattern_Ques22_Way1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// N=5 which is given in pattern Ques
// In this ques pattern will dvidie in 3 parts which are 1) first part : for stars
// 2) Mid Part : for spaces    3) Last Part : For stars

Scanner sc= new Scanner(System.in);
int N= sc.nextInt();

int row=1;
int star=N;  // In first row for first part there is 5 stars so in N terms it will be N=5
int space= -1;  // In first row acc. to pattern there is no space due to this there will be 0 but 
                // As seeing the pattern space will increase by 2 after 2 row if we put 0 space in row and increase this by 2 then
                // For 2 row space will become 0+2=2 but in pattern space is 1
                // So for spaces of row1 = -1 : row2= -1+2 = 1 space : row3= 1+2=3 : row4= 3+2=5 : row4= 5+2=7


while(row<=N)  // Step1 : Loop for total no. of rows
{

int i=1;   // Loop for First part of pattern
while(i<=star)  // Loop for task 1 in first row which is for stars
{
System.out.print("* ");
i++;
}

int j=1;  // Loop for mid part of pattern
while(j<=space)   // Loop for task 2 in first row which is for space
{
System.out.print("  ");
j++;
}

int k=1; // Loop for last part of pattern

if(row==1) // due to extra star print in row 1 bcoz of the condition k<=star so it will go til k<=5 but in last part star will be 4
{
k=2;      // so for this k will start from 2 and go till k<=5 : 2<=5 = so it print 4 stars
}

while(k<=star)  // Loop for task 3 in first row which is for stars
{
System.out.print("* ");
k++;
}

row++;   // Step3 : Next row prep
System.out.println();
star--;   // Acc. to pattern star will deccreased by 1 in each line change
space+=2;  // Acc. to pattern space will increased by 2 in each line change
}
}
}