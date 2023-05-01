package p34;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S34 {
	public static void main(String[] args) {
		System.out.println("Enter an Email");
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		Pattern p=Pattern.compile("[a-z]+[0-9|_]@gmail[.]com");
	    Matcher m=p.matcher(s);
	    if(m.find()&&(m.group().equals(s))) 
	    	System.out.println("A valid email");
	    else
	    	System.out.println("invalid");
	    sc.close();
	    
	}
	
	

}
