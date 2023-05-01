package p21;

import java.util.Scanner;

public class S21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt();
		int temp,s,d;
		 s=0;
		 temp=a;
		 while(a!=0) {
			 
		 d=a%10;
		 s=s+d;
		 a=a/10;
		 }
		 System.out.println((temp%s==0)?"yes":"no");
	}
	
	
}
