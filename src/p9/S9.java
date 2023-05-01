package p9;

import java.util.Scanner;

//implement a program to find out sum of the prime digit of a number
public class S9 {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Eneter a number");
	int a=sc.nextInt();
	int d,s=0;
	while(a!=0) {
		d=a%10;
		if(d==2 || d==3 || d==5 || d==7)
			s=s+d;
		a=a/10;
		
	}
	System.out.println(s);
}
}
