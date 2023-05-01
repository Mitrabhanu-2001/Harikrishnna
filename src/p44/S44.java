package p44;

import java.util.Scanner;

public class S44 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),se=0,so=0,i;
		int a []=new int[n];
		for( i=0; i<n;i++)
			a[i]=sc.nextInt();
		for( i=0;i<n;i++) {
			if(a[i]%2==0)
				se=se+a[i];
			else
				so=so+a[i];
		}
		System.out.println(Math.abs(se-so));
	}

}
