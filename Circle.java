package basicjava;
import java.util.Scanner;

public class Circle {
public float radius;
public String colour;

public float getradius()
{
	return radius;
}

public void calcArea(float radius)
{
	double area=3.14 *radius*radius;
	System.out.println("area of the circle is :\n"+area);
}
	public static void main(String[] args) {
		Circle c=new Circle();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of the circle ");
		Float a=sc.nextFloat();
		c.calcArea(a);
	}
}
