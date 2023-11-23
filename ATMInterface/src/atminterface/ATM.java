package atminterface;

public class ATM {
	private double balance=0;
	private double depositAmt;
	private double withdrawAmt;
	
	public ATM() {
		
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getDepositAmt() {
		return depositAmt;
	}
	public void setDepositAmt( double depositAmt) {
		this.depositAmt=depositAmt;
		
	}
	public double getWithdrawAmt() {
		return withdrawAmt;
	}
	public void setWithdraAmt(double withdrawAmt) {
		this.withdrawAmt=withdrawAmt;
	}
	
	

}
