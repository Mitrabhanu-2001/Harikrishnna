package p12;

import java.util.Scanner;

public class S12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number"); 
		int a= sc.nextInt();
		int d,s=0;
		while(a!=0) {
			d=a%10;
			s=s*10+d;
			a=a/10;
		}
		System.out.println(s);
	}

}
