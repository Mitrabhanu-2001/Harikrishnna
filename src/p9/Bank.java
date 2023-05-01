package p9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount b1= new BankAccount();
		while(true){
			try {
				System.out.println("enter number");
				double balance=sc.nextDouble();
				b1.setBalance(balance);
				System.out.println("Current balane"+balance);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("enter number");
				sc.nextLine();
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
				
				
				
			}
		}
		
	}
}


