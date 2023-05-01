package p7;
// implement a program to find out sum of the even number in that given number
import java.util.Scanner;

public class S7 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int d, s=0;
		while(a!=0) {
			d=a%10;  
			if(d%2==0)
				s=s+d;
			a=a/10;
			
		}
		System.out.println(s);

	}

}
