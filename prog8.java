import java.util.Scanner ;


public class prog8 {
       public static void main(String[] args){
		

		int num ,sum=0,c=0;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Number :");
		num =scan.nextInt();
		sum +=num;
		
		do {
			sum+=c;
			System.out.print("Do You Want to Continue This Program Then Enter 1,Otherwise The Entered Number Will Be Added");
			c= scan.nextInt();
		   }while (c !=1);
	  System.out.println("The Sum Of The Number Is :" + sum);
	}
}