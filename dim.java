package p1;

public class twodim {
	private int x;
	private int y;
	
	public twodim()
	{
		int x=0;
		int y=0;
	}
	public twodim(int x,int y)
	{
		this.x=x;
		this.y=y;
		
	}
	public String toString()
	{
		return ("the cordinates are x= "+ x +" y="+ y);
	}
}

package p2;

public class threedim extends p1.twodim {
	private int z;
	public threedim()
	{
		
		int z=0;
	}
	public threedim(int x,int y,int z)
	{
		super(x,y);
		this.z=z;
	}
	public String toString()
	{
		return (super.toString()+" z= "+ z);
	}
}

package p1;

import java.util.*;
import p1.twodim;
import p2.threedim;

public class dim {
	public static void main(String[] args)
	{
		System.out.println("Enter the coordinates ");
		Scanner sc= new Scanner(System.in);
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		twodim obj=new twodim(p,q);
		System.out.println(obj);
		obj=new threedim(p,q,r);
		System.out.println(obj);
		
		}
}
