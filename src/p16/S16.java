package p16;

import java.util.Scanner;

public class S16 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt(),  b=sc.nextInt() , c=0,d;
		while(a!=0) {
			d=a%10;
			if(d==b) { 
				c++;
			}
				a=a/10;
		}
		System.out.println(c);
	}

	}

