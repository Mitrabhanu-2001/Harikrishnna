package p9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VoterRegd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			
				Voter v=new Voter();
				System.out.println("Enter name");
				v.setName(sc.nextLine());
				try {
					System.out.println("enter age");
					v.setAge(sc.nextInt());
					System.out.println("hi"+v.getAge()+"your data is saved");
					System.out.println("please collet your card in 30 days");
					
				}
				catch(InputMismatchException e) {
					System.out.println("pass interger");
					sc.nextInt();
				}catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
			}
		}
	}

}
