package p54;

import java.util.Scanner;

public class S55 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1st string");
		String s1= sc.nextLine();
		System.out.println("Enter 2nd number");
		String s2= sc.nextLine();
		System.out.println(s1.endsWith(s2));
	}

}
