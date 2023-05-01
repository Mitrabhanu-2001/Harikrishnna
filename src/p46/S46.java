package p46;

import java.util.Scanner;

public class S46 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the date");
		String[] s= sc.nextLine().split("-");
		System.out.println(s[2].endsWith(Integer.toString(Integer.parseInt(s[0])*Integer.parseInt(s[1]))));
	}

}
