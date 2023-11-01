package Account;
class BankAccount{
	int acNo;
	String acName, acPhone, acEmail;
	double acBalance;
	public BankAccount(int acNo, String acName, String acPhone, String acEmail, double acBalance) {
		this.acNo=acNo;
		this.acName=acName;
		this.acPhone=acPhone;
		this.acEmail=acEmail;
		this.acBalance=acBalance;
	}
	public  void accountHolder() {
		System.out.println("Account number :"+acNo);
		System.out.println("Account holder Name:"+acName);
		System.out.println("Account holder Address:"+acEmail);
		System.out.println("Account holder Phone:"+acPhone);
		System.out.println("Account holder Balance:"+acBalance);
		
	}
	public void deposit(double amount) {
		acBalance+=amount;
		System.out.println("Deposited:"+amount);
		
	}
	public void displayBalance() {
		System.out.println("Account Number: "+acNo+"\nBalance: "+acBalance+"\n");
	}

}
class SavingAccount extends BankAccount{
	public SavingAccount(int acNo, String acName, String acPhone, String acEmail, double acBalance) {
		super(acNo, acName, acPhone, acEmail, acBalance);
	}
}
class currentAccount extends BankAccount{
	public currentAccount(int acNo, String acName, String acPhone, String acEmail, double acBalance) {
		super(acNo, acName, acPhone, acEmail, acBalance);
	}
}

public class Account {

	public static void main(String[] args) {
		
		System.out.println("SAVINGS ACCOUNT DETAILS");
		SavingAccount detail = new SavingAccount(201, "Johnbaptist Wangui","0733330100","john12@gmail.com",1000);
		detail.accountHolder();
		detail.deposit(500.0);
		detail.displayBalance();
		
		System.out.println("CURRENT ACCOUNT DETAILS");
		currentAccount ca =new currentAccount(1002,"Janet Wangari","0778951651","janet13@gmail.com",1000);
		ca.accountHolder();
		ca.deposit(300.0);
		ca.displayBalance();

	}

}
