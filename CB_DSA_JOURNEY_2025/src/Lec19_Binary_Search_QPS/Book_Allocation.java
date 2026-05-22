package Lec19_Binary_Search_QPS;

import java.util.Scanner;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);

int nos= sc.nextInt();
int nob= sc.nextInt();

int [] pages= new int[nob];
for(int i=0;i<pages.length;i++)
{
pages[i]=sc.nextInt();
}

System.out.println(page_assign(pages,nos));
	}

public static int page_assign(int[]pages , int nos)
{
int lo=0;
int hi=0;
int ans=0;

for(int i=0;i<pages.length;i++)
{
hi=hi+pages[i];
}

while(lo<=hi)
{
int mid= (lo+hi)/2;
if(isitpossible(pages,nos,mid)==true)
{
ans=mid;
hi=mid-1;
}

else
{
lo=mid+1;
}
}

return ans;
}

public static boolean isitpossible (int[]pages ,int nos ,int mid)
{
int s=1;
int readpages=0;

for(int i=0;i<pages.length;)
{

if(readpages + pages[i]<=mid)
{
readpages += pages[i];
i++;
}

else
{
s++;
readpages=0;
}

if(s > nos)
{
return false;
}
}
return true;
}
}
