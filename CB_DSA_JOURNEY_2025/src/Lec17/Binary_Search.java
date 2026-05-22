package Lec17;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
int N=sc.nextInt();

int[]arr= new int[N];
int item=sc.nextInt();

for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println(Binary_search(arr,item));

}

public static int Binary_search (int[]N , int item)
{
int lo=0;
int hi= N.length-1;



while(lo<=hi)  // Binary search
{
int mid= (lo+hi)/2;
if(N[mid]==item)
{
return mid; // Return index no. if required item will found
}

if(N[mid]<item)
{
lo=lo+1;
}

else
{
hi=hi-1;
}
}

return -1;  // If required item value doesn't present in array then it returns -1
}
}

