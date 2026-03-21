package Lec15_Array_Ques;

public class Baisc_Rotating_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int []nums= {1,2,3,4,5,6,7};
int k=3; // k is how many times i need to rotate the array

rotate(nums,k);

for(int i=0;i<nums.length;i++)
{
System.out.print(nums[i] +" ");
}
	}

public static void rotate(int[]nums,int k)
{

int N=nums.length;
int val=k%N; // if we need to rotate the array 143 times but as per me after whatever the length of array then it starts repeating
            // Eg here length of array is 7; after 7 it starts repeating 
            // So if we need to know what is the array after 143 rotation ; k%N= 143%7 = 3 that means what is the array at 3 rotation is same at 143 location
while(val>0)
{

int item=nums[nums.length-1];  //Storing last number of array separately bcoz we need to print at 0th index after shifting all the numbers

int i=nums.length-2; // So loop we will start from 5th index
while(i>=0) // in this we are shifting values of array one back ; if value 5 at 4th index then it shift to 5th index
{
nums[i+1]=nums[i];  //Eg; for index 5th =if i=N-2=7-2=5 so we need to shift 5th index value to 6th index
                  // So i+1= here i=N-2=7-2=5 so i+1=5+1=6
i--;  // Loops starts from 5th index so it will going to decreasing of i
}
nums[0]=item; // After all the shifting; then put the last index value before shifting which is store in item which is 7 at 0th index
val--; // then do this till val>0
}
}
}
