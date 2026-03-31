package Lec16_Sorting;

public class print_idx_number_of_minvalue_in_given_range_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int [] arr= {5,3,-7,4,-8,2};
int index=1;

System.out.println(minidx(arr,index));
	}

public static int minidx(int[]arr,int index)
{
int val=index;
for(int i=index+1;i<arr.length;i++)
{
if(arr[i]<arr[val])
{
val=i;
}
}

return val;
}
}
