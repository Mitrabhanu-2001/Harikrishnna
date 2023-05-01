package p37;

import java.util.Scanner;

public class S37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z') 
				System.out.println((char)(s.charAt(i)+32));
				else if(s.charAt(i)>='a'&& s.charAt(i)<='z')
					System.out.println((char)(s.charAt(i)-32));
					
			}
		}
	}


