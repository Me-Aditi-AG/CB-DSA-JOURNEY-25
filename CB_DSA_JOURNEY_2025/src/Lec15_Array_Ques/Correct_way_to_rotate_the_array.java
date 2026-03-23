package Lec15_Array_Ques;

public class Correct_way_to_rotate_the_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] nums= {1,2,3,4,5,6,7};
int k=3;

rotate(nums,k);

for(int i=0;i<nums.length;i++)
{
System.out.print(nums[i]+" ");
}

	}

public static void rotate(int[]nums, int k)
{

int N= nums.length;
int T= k%N; // if k=143 and N(array length)=7 then T=k%N ; 143%7=3 that means at 143 rotated array equals to the rotated array 3 when k=3

reverse(nums,N-T , N-1); // for reverse i=N-k ,j=N-1
reverse(nums,0,N-T-1); // for reverse i=0 , j=N-k-1
reverse(nums,0,N-1);  // for reverse i=0 , j=N-1
}

public static void reverse(int[]N , int i, int j)
{

while(i<j)
{
int temp= N[i];
N[i]=N[j];
N[j]=temp;

i++;
j--;
}

}
}
