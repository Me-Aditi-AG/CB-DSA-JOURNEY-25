package Lec14_Array_Basic;

public class Reverse_the_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int []arr= {3,4,5,2,1,7,6};

reverse(arr);

for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
	}

public static void reverse(int[]N)
{
	
int i=0;
int j=N.length-1;

while(i<j)
{
int temp=N[i];
N[i]= N[j];
N[j]= temp;

i++;
j--;
}
}
}
