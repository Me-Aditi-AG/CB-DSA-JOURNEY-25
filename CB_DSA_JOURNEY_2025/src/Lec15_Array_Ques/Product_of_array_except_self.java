package Lec15_Array_Ques;

public class Product_of_array_except_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int [] nums= {5,2,3,4,6};

int[]ans= product(nums); // due to this i store the return ans from left in another array which is ans

for(int i=0;i<ans.length;i++) //And printing the output which is stored in ans array
{
System.out.print(ans[i]+" ");
}
	}

public static int [] product(int[]nums)  // Bcoz here i need to return the integer type array 
{

int N= nums.length;

//To calculate the product of left of the numbers except itself

int[]left= new int[N];

left[0]=1;
for(int i=1; i<N;i++)
{
left[i]= left[i-1]*nums[i-1];
}
	
// To calculate product of right of the numbers except itself

int[]right= new int[N];

right[N-1]=1;
for(int i=N-2;i>=0;i--)
{
right[i]=right[i+1]*nums[i+1];
}

for(int i=0;i<N;i++)
{
left[i]= left[i]*right[i];
}

return left;
}
}
