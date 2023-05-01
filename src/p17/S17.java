package p17;

import java.util.Scanner;

public class S17 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt(),r,temp,d;
		r=0;
		temp=r;
		while(a!=0) {
			d=a%10;
			r=r*10+d;
			a=a/10;
		}
		System.out.println((temp==a)?"yes":"no");

	}

}
