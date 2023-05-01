package p54;

import java.util.Arrays;
import java.util.Scanner;

public class S59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		char ch1[]=sc.nextLine().toCharArray();
		char ch2[]=sc.nextLine().toCharArray();
		Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    System.out.println(Arrays.equals(ch1,ch2));
	}

}
