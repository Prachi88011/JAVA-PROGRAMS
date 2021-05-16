import java.util.Scanner;
public class prog2{
public static void main(String args[]){
int fact=1,num;
Scanner scan =new Scanner(System.in);
System.out.println("Enter the number of which factorial needs to be calculated:");
num=scan.nextInt();
for(int i=1;i<=num;i++){
fact*=i;
}
System.out.println("factorial of the number is:"+fact);
}
}