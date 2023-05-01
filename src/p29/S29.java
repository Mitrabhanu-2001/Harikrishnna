package p29;
// prime or not
import java.util.Scanner;

public class S29 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt(),i,count=0;
		for(i=1;i<=a;i++){
			if(a%i==0)
				count++;
				
		}
		System.out.println(count==2);
	}

}
