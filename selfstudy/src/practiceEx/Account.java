package practiceEx;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<Account.MIN_BALANCE ||
		balance>Account.MAX_BALANCE){
		return;	// 유효성 검사 
		}
		this.balance = balance;
	}
	
	
	
}
