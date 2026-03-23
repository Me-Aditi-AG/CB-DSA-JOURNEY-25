package Lec15_Array_Ques;

public class Trapping_rain_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int []arr= {0,1,0,2,1,0,1,3,2,1,2,1};

System.out.println(rain_water(arr));
	}

public static int rain_water(int[]arr) {

int N=arr.length;

// To calculate left max
int[]left= new int[N];

left[0]=arr[0];

for(int i=1;i<N;i++)
{
left[i]= Math.max(left[i-1], arr[i]);
}

// To calculate right max
int []right=new int[N];

right[N-1]=arr[N-1];

for(int i=N-2;i>=0;i--)
{
right[i]=Math.max(right[i+1], arr[i]);
}

// To calculate trapped rain water
int sum=0;
for(int i=0;i<N;i++)
{
sum=sum+ (Math.min(left[i], right[i]))-arr[i];
}

return sum;
}
}
