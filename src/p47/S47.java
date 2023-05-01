package p47;

import java.util.Scanner;

public class S47 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt(),d,s=0;
		while(a!=0) {
			d=a%10;
			s=s+d;
			a=a/10;
		}
		System.out.println((s%2==0)?"Evenish":"oddish");
	}

}
