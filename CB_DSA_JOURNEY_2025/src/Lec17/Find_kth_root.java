package Lec17;

import java.util.Scanner;

public class Find_kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
int N=sc.nextInt();
int k=sc.nextInt();

System.out.println(root(N,k));
	}

public static int root(int N, int k)
{
int lo=0;
int hi=N;

int ans=0;
while(lo<=hi)
{
int mid=(lo+hi)/2;

if(Math.pow(mid, k)<=N)
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
}
