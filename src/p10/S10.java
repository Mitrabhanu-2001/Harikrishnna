package p10;
 //implement a program to find sum of the digit that are divisuble by 3
import java.util.Scanner;

public class S10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int d, s=0;
		while(a!=0) {
			d=a%10;
			if(d%3==0)
				s=s+d;
		       a=a/10;
			
		}
   System.out.println(s);
	}

}
