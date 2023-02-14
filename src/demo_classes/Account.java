package demo_classes;

public class Account {
	private final long ACCOUNT_ID;
	private long nextAccountID;
	protected double balance;
	
	public Account() {
		super();
		this.ACCOUNT_ID = 0;
	}
	
	public double withdrawal(double amount) {
		return 0.0;
	}
	
	public void deposit(double amount) {
		
	}
	
	public void correctBalance(double amount) {
		
	}
	
	public long getACCOUNT_ID() {
		return ACCOUNT_ID;
	}
	
	public double getBalance() {
		return balance;
	}
	
}
