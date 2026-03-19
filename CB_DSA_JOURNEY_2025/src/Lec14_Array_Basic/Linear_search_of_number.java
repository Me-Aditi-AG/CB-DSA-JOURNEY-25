package Lec14_Array_Basic;

public class Linear_search_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int [] arr = {7,4,5,1,6,8};
int item=7;

System.out.println(search(arr,item));
	}

public static int search (int[]N , int val) // Getting passed the address of arr array and vitem value
{

for(int i=0;i<N.length;i++) // due to this loop i can check the val value at each index 
{
if(N[i]==val)
{
return i; // If found the val value equals to the index value then return that index
}
}
return-1; // Other wise return -1
}
}


