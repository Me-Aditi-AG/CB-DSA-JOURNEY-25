package Lec2;

public class Area_Triangle_using_heronz_formula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// To calculate area of triangle using Heronz formula
		
// S= (a+b+c)/2
// Area of Triangle heronz Formula = sqrt of whole (s*(s-a)*(s-b)*(s-c))
		
int a= 3;
int b= 4;
int c= 5;
int s = (a+b+c)/2;

double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println(area);

	}

}
