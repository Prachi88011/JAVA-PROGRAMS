package p1;

public abstract class Shape {
	public int l,b;
	public int r;
	public double a;
	public void  Shape(int l,int b)
	{
		 this.l=l;
		 this.b=b;
	}
	public void Shape(int r)
	{
		this.r=r;
	}
		public abstract double  area();
		
		
	}
package p2;

public class Rectangle extends p1.Shape {
	public double area()
	{
		a= l*b;
		return a;
	}
	

}
 package p3;

public class Circle extends p1.Shape {

	public double area()
	{
		a=3.14*r*r;
		return a;
	}

}
package p;
import java.util.*;
import p1.Shape;
import p2.Rectangle;
import p3.Circle;
public class shapearea{
public static void  main (String[] args) {
	int l=0,b=0,r=0;
	Shape obj;
	Shape c=new Circle();
			Scanner sc=new Scanner(System.in);
	System.out.println("1.Rectangle");
	System.out.println("2.Circle");
	System.out.println("Enter the type of shape");
	int q=sc.nextInt();
	switch(q)
	{
	case 1:
			System.out.print("enter the length and breadth");
			l= sc.nextInt();
			b=sc.nextInt();
			obj=new Rectangle();
			obj.Shape(l,b);
			System.out.print("Area of the rectangle is "+ obj.area());
			break;
	case 2:
			System.out.print("Enter the radius");
			r= sc.nextInt();
			
			c.Shape(r);
			System.out.print("Area of the circle is "+ c.area());
			
			
			
	}
	
}


