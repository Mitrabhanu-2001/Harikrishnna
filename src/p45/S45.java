package p45;

import java.util.Scanner;

public class S45 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entera number");
		int a= sc.nextInt(),s=0,i;
		for(i=1;i<a;i++) {
			if(a%i==0)
				s=s+i;
		}
		System.out.println(s==a);
		
	}

}
