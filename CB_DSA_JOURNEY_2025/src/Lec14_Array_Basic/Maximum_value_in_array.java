package Lec14_Array_Basic;

public class Maximum_value_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int []arr= {3,5,1,7,8,9};

System.out.println(max(arr));
	}

public static int max(int[]N)
{
int prev= N[0]; // already accessing 0th value of array which is 3 store in prev 

for(int i=1;i<N.length;i++) // starting i=1 bcoz checking if 5>3 then change prev value from 3 to 5 and further go on 
{
if(N[i]>prev) // 5>3 , 1>5, 7>1,8>7,9>8 then change prev value according to it
{
prev= N[i];
}
}
return prev;
}
}