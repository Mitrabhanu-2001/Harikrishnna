package p22;

import java.util.Scanner;

public class S22 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt(), p,q,r;
        p=a%10;
        q=((a/10)%10);
        r=(p+q)+(p*q);
        System.out.println((r==a)?"yes":"No");
	}

}
