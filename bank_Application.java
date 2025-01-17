package oops;

import java.util.Scanner;

interface Bank{
	void accountDetails();
	void balance();
	void withdraw();
	void deposit();
}
class SBI implements Bank{
	Scanner sc=new Scanner(System.in);
	static String bank="SBI"; 
	int balance = 30000;
	@Override
	public void accountDetails() {
		int AccountNo,IFSC;
		String name="";
		System.out.println("Enter the Account No and IFSC code");
		AccountNo=sc.nextInt();
		IFSC=sc.nextInt();
		System.out.println("Enter the Name of the Account Holder");
		name=sc.next();
		System.out.println("The AccountNO of "+AccountNo+" with IFSC code "+IFSC+" is "+name);
	}

	@Override
	public void balance() {
		System.out.println("The balance is Rs "+balance);
	}

	@Override
	public void withdraw() {
		System.out.println("Enter the amount needed to withdraw");
		int amount=sc.nextInt();
		if(amount>balance)
		{
			System.out.println("Insufficent Balance");
		}
		else {
			balance=balance-amount;
			System.out.println("The amount withdrawen is "+balance);
		}
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter the amount need to be deposited");
		int deposit=sc.nextInt();
		balance=deposit+balance;
		System.out.println("The Total amount in account is "+balance);
	}
}
class Unionbank extends SBI implements Bank{
}
public class bank_Application {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		SBI ob=new SBI();
		System.out.println("Enter the number that you want from 1 to 4 \n"+"1.Account Details \n"+"2.Balance \n"+"3.Withdraw \n"+"4.Deposit \n");
		int n=s.nextInt();
		switch(n)
		{
		case 1:ob.accountDetails();
				break;
		case 2:ob.balance();
				break;
		case 3:ob.withdraw();
		        break;
		case 4:ob.deposit();
				break;
		default:System.out.println("Invalid");
		}
		
	}

}
