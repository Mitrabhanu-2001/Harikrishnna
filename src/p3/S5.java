package p3;

import java.util.Scanner;

//Extract digit from number
public class S5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int a= sc.nextInt();
		while(a!=0) {
			System.out.println((a%10)+"");
			a=a%10;
		}

	}

}
