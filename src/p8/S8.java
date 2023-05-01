package p8;
//implement a program to find the odd digit of a number
import java.util.Scanner;

public class S8 {
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number");
	int a= sc.nextInt();
	int d, s=0;
	while(a!=0) {
		d=a%10;
		if(d%2!=0)
			s=s+d;
		    a=a/10;
		    
			
	}
	System.out.println(s);
}
}
