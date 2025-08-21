package Lec2;

public class Greater_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// To find which no. is greater between 3 No.'s
		
int a=5;
int b=6;
int c=7;

if (a>b && a>c) // due to using && operator both conditions will get true then loop will work`
{
System.out.println(a);
}
else if (b>a && b>c)   // we use elseif here bcoz above if loop will work then program will end 
	                   // above if loop didn't work then it will go to elseif and then program ends if condition gets true
	                   // we use if in both of the loops that also said if two of the loops condition gets true then it will work didnt get ends
{
System.out.println(b);
}
else
{
System.out.println(c);
}
	}

}
