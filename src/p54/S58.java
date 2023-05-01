package p54;

import java.util.Scanner;

public class S58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st name");
		String s1=sc.nextLine();
		System.out.println("Enter 2nd name");
		String s2=sc.nextLine();
		System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1)+s2);

	}

}
