package p32;

import java.util.Scanner;

public class S32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you want to print");;
		String s=sc.nextLine();
		int i,c=0;
		for(i=0; i<s.length();i++) {
        char ch=s.charAt(i);
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9'))
        	continue;
        else
        	c++;
	}
    System.out.println(c);
}
}
