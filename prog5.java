import java.util.Scanner;
class Complex {
     int real,img;
     public Complex(){
	}
public Complex(int a, int b)  {
		this.real=a;
		this.img=b;
	}
	public String get()
	{
	   return real+"+"+img+"i";
	}
	public static Complex ADD(Complex a,Complex b)
	{
	    Complex C= new Complex();
	    C.real=a.real + b.real;
	    C.img=a.img + b.img;
	     return C;
	}
	public static Complex SUB(Complex a,Complex b)
	{
	    Complex C =new Complex();
	    C.real=a.real-b.real;
	    C.img= a.img-b.img;
	     return C;
	}
	public static Complex MUL(Complex a,Complex b)
	{
	    Complex C=new Complex();
	    C.real=((a.real*b.real)-(a.img*b.img));
	    C.img=((a.img*b.real)+(b.img*a.real));
	    return C;
	}
   }
public class prog5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int a,b,c,d;
		
		System.out.print("\t\t\tEnter Complex Number");
		System.out.println();
		System.out.print("Real and Imaginary part of Complex Number 1:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print("Real and Imaginary part of Complex Number 2:");
		c=sc.nextInt();
		d=sc.nextInt();
		System.out.println();
		Complex C1= new Complex (a,b);
		Complex C2= new Complex (c,d);
		System.out.println("\t\t\tOriginal Numbers");
		System.out.println(C1.get());
		System.out.println(C2.get());
		System.out.println();
		Complex ad=Complex.ADD(C1,C2);
		Complex su=Complex.SUB(C1,C2);
		Complex mu=Complex.MUL(C1,C2);

		System.out.println("Addition of entered numbers     :"+ad.get());
		System.out.println("Subtraction of entered number   :"+su.get());
		System.out.println("Multiplication of entered number:"+mu.get());
		System.out.println();
		System.out.println("\t\t\tProgram Ended");
	}
}
		