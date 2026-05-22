package Lec19_Binary_Search_QPS;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);

int N=sc.nextInt();
int c= sc.nextInt();

int []stall= new int[N];
for(int i=0;i<stall.length;i++)
{
stall[i]=sc.nextInt();
}

Arrays.sort(stall);  // To sort the array

System.out.println(placement(stall,c)); // Calling placement function
	}
	
	
public static int placement(int[]stall,int c)
{                      // Using Binary search on distance not on values
int n= stall.length;  //Function to calculate mid and check the largest distance between the cows possible
int lo= stall[0];
int hi= stall[n-1]-stall[0];
int ans=0;
while(lo<=hi)
{
int mid= (lo+hi)/2;
if((isitpossible(stall,mid,c))==true)     // Calling isitpossible to check the above calculated mid is we assign the cows
{
ans=mid;
lo=mid+1;
}

else
{
hi=mid-1;
}
}
return ans;
}


public static boolean isitpossible(int []stall,int mid, int c)
{
int cow=1;
int pos=stall[0];

for(int i=1;i<stall.length;i++)
{
if(stall[i]-pos>=mid)
{
pos=stall[i];
cow++;
}

if(cow==c)     // If we assogn the all cows for the mid then it returns true
{
return true;
}
}
return false;  // Otherwise false and then new mid will come
}
}
