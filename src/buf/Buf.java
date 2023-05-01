package buf;

import java.io.*;
class Buf
{
	public static void main(String[]args)throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter eno:");
		int eno=Integer.parseInt(br.readLine());
		System.out.println("enter ename:");
		String ename=br.readLine();
		System.out.println("enter sal:");
		double sal=Double.parseDouble(br.readLine());
		System.out.println("enter mibile no:");
		long mobile =Long.parseLong(br.readLine());
		System.out.println("enter dept:");
		String dept= br.readLine();
		  

		    System.out.println("values enter");
			System.out.println("eno:"+eno);
			System.out.println("ename:"+ename);
			System.out.println("salary:"+sal);
			System.out.println("mobile no:"+mobile );
			System.out.println("dept:"+dept);

		
}
}
