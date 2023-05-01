package p35;

import java.util.Scanner;

public class S35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        
        int a=sc.nextInt();
        int d,s=0;
        while(a!=0) {
        	d=a%10;
        	if(d==2||d==4||d==6||d==8||d==9)
        		s=s+d;
        	    a=a/10;
        }
        System.out.println(s);
	}

}
