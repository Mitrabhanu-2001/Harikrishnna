package p36;

import java.util.Scanner;

//implement a program to find 1st capital letter from a word
public class S36 {

	public static void main(String[] args)throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter");
	    String s=sc.nextLine();
	    for(int i=0;i<=s.length();i++) {
	    	if(Character.isUpperCase(s.charAt(i))) {
	    		System.out.println(s.charAt(i));
	    		break;
	    	}
	    }
	}

}
