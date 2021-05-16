import java.util.Scanner ;
public class prog3{
public static void main(String args[]){
int a[]=new int[10],s;
Scanner scan =new  Scanner(System.in);
System.out.println("Enter the size of the array:");
s=scan.nextInt();
System.out.println("Enter the elements of the array:");
for(int i=0;i<s;i++)
{
a[i]=scan.nextInt();
}
for(int x=0;x<s;x++)
{
	a[x]=a[x]+5;
}
System.out.println("After adding 5 in each elements :");
for(int j=0;j<s;j++){
System.out.print(a[j]+" ");
}
}
}