package p60;

import java.util.Scanner;

public class S60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name");
		String s=sc.nextLine();
		int a []=new int[256];
		int i,max=0;
		for(i=0;i<s.length();i++) 
			a[(int)s.charAt(i)]++;
			max=0;
			
			for(i=0;i<256;i++) {
				if(a[i]>a[max]) 
					max=i;
			
			}
			System.out.println((char)max);

	}

}
