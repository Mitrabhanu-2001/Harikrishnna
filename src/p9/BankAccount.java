package p9;

public class BankAccount {
	private double balance;
	public void setBalance(double balance)throws IllegalArgumentException {
		if(balance==0)
			throw  new IllegalArgumentException("do not pass zero");
			
	 if(balance<0)
		 throw new IllegalArgumentException("do not pass zero");
		 this.balance=balance;
	}
   public double getBalance() {
	   return balance;
	   
   }
}

	
	


