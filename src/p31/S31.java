package p31;
//implement a program to find a 4 digit pin 
import java.util.Scanner;

public class S31 {
	static int maxDigit(int a){
		int m=0,d;
		while(a!=0) {
			d=a%10;
			if(d>m)
				m=d;
			a=a/10;
		}
	    return m;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int a2=sc.nextInt();
		System.out.println("Enter 3rd number");
		int a3=sc.nextInt();
		int w=Math.min(Math.min(a1%10,a2%10),a3%10);
		int x=Math.min(Math.min((a1/10)%10,(a2/10)%10),(a3/10)%10);
		int y=Math.min(Math.min((a1/100)%10,(a2/100)%10),(a3/100)%10);
		int z=Math.max(Math.max(maxDigit(a1),maxDigit(a2)),maxDigit(a3));
		System.out.println(z*1000+y*100+x*10+w*1);
	}

}
