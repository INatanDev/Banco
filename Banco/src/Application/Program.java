package Application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		
		/*
		 * Account acc = new Account(2001, "Natan", 0.0); BusinessAccount bacc = new
		 * BusinessAccount(2002, "Maria", 0.0, 500.0);
		 * 
		 * 
		 * //UPCASTING
		 * 
		 * Account acc1 = bacc; Account acc2 = new BusinessAccount(2003, "Allyson", 0.0,
		 * 600.0); Account acc3 = new SavingsAccount(2004, "Yasmin", 0.0, 0.01);
		 * 
		 * //DOWNCAST
		 * 
		 * BusinessAccount acc4 = (BusinessAccount)acc2; acc4.loan(100.0);
		 * 
		 * if(acc3 instanceof BusinessAccount ) { BusinessAccount acc5 =
		 * (BusinessAccount)acc3; acc5.loan(200.0); System.out.println("Loan!"); }
		 * 
		 * if(acc3 instanceof SavingsAccount) { SavingsAccount acc5 =
		 * (SavingsAccount)acc3; acc5.updateBalance(); System.out.println("Update!"); }
		 */
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 500., 0.01);
		acc2.withdraw(700.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Roberta", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}
}
