package Lec16_Sorting;

public class Kaden_algo_Maximum_sum_of_sub_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int []arr= {-2,1,-3,4,-1,2,1,-5,4};

System.out.println(Max_sum(arr));
	}

public static int Max_sum(int[]arr)
{

int ans=Integer.MIN_VALUE;
int sum=0;
for(int i=0;i<arr.length;i++)
{
sum=sum+arr[i];

ans=Math.max(ans, sum);
           // For exception case
if(sum<0) // If i write this condition above ans line if arr={-1}; then it calculate the sum =-1
{         // And due to sum<0 : -1<0 then sum become 0 and after ans statement its reurn 0 in ans which is wrong bcoz we need to retun -1 as ans
sum=0;
}


}
return ans;
}
}
