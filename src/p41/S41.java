package p41;

import java.util.Scanner;

public class S41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter order id");
		int a=sc.nextInt() ,p=1,d;
		while(a!=0) {
			d=a%10;
			p=p*d;
			a=a/10;
		}
		System.out.println(p);
		}

}
