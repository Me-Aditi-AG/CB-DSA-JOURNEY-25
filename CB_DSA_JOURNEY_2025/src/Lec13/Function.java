package Lec13;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Hello");
int a=10;
int b=5;

System.out.println(Add(a,b)); // passing the value of a and b
                              // and printing the value of d which get passed in function add(a,b)
System.out.println("Bie");

	}
	
public static int Add(int p, int q)  // getting the same value of a and b because here we pass the values not variables 
{                                   // so it doesn't matter the variable name is same or different
int c= p+q;
int d= c+ sub(q,c);
return d;               // it returns the value to the function add(a,b)
 
}

public static int sub(int q, int c)  // getting the same value of q and c
{
int e= q-c;
return e;          // it return the value to the function sub(q,c)
}
}
