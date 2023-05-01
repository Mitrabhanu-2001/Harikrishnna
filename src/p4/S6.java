package p4;
//implement a program to find the sum of a number
import java.util.Scanner;

public class S6 {
  public static void main(String[]args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Eneter a number");
	  int a= sc.nextInt();
	  int s=0,d;
	  while(a!=0) {
		  d=a%10;
		  s=s+d;
		  a=a/10;
		  
	  }
	  System.out.println(s);
  }
}
