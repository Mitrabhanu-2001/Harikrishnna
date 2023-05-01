package p50;

import java.util.Scanner;

public class S50 {
	static int sum(int a){
		int d,s=0;
		while(a!=0) {
			d=a%10;
			s=s+d;
			a=a/10;
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt(),i,s=0;
		for(i=n1; i<n2; i++) {
			s=s+sum(i);
		}
		System.out.println(s);
	}

}
