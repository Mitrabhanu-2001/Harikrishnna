package p33;
//implemet a program to find discount of the bill odd number sum
import java.util.Scanner;

public class S33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bill amount");
		int a=sc.nextInt();
		int d,s=0;
		while(a!=0) {
			d=a%10;
			if(d%2!=0)
				s=s+d;
			    a=a/10;
		}
		System.out.println("Discount amount is");
		System.out.println(s);
	}

}
