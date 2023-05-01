package p42;

import java.util.Scanner;

//find the prime sum of the given two number range
public class S42 {

	static boolean Prime(int a) {
		int count=0,i;
		for(i=1;i<=a;i++) {
			if(a%1==0)
				count++;
		}
		return count==2;
	}
	public static void main(String[] args) throws Exception{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st  number");
		int a1= sc.nextInt();
		System.out.println("Enter 2nd number");
		int a2=sc.nextInt();
		int s=0,i;
		for(i=a1; i<=a2; i++) {
			if(Prime(i))
				s=s+i;
		}
		System.out.println(s);
	}
		

	}

