package atminterface;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public  class ATMOperations implements ATMOperationInterface {
	ATM atm=new ATM();
	Map<Double,String>ministatement=new HashMap<>();
	
	@Override
	public void viewBalance() {
		System.out.println("Current Account Balance:"+atm.getBalance());
		System.out.println();
		
	}
	@Override
	public void withdrawAmt(double withdrawAmt) {
		
		Scanner sc=new Scanner(System.in);
		if(withdrawAmt%100==0)
		{
			if(withdrawAmt<=atm.getBalance())
			{
				System.out.println("Please confirm your choice by Yes(Y) or No(N)");
				String confirm=sc.next();
				if(confirm.equals("Y")){
					ministatement.put(withdrawAmt, "Amout Withdrawn");
					System.out.println("Collect your Cash: " +withdrawAmt);
					atm.setBalance(atm.getBalance()-withdrawAmt);
					viewBalance();
					
				}
			}
			else
			{
				System.out.println("Insufficient Balance in your Account.");
			}
		}
		else
		{
			System.out.println("Please Enter the Amount in multiple of 100.");
		}
		
	}
	@Override
	public void depositAmt(double depositAmt) {
		System.out.println("Please confirm your choice by Yes(Y) or No(N)");
		Scanner sc=new Scanner(System.in);
		String confirm=sc.next();
		if(confirm.equals("Y")){
		ministatement.put(depositAmt, "Amout Deposited");
		System.out.println(depositAmt+"Deposited Successfully!");
		atm.setBalance(atm.getBalance()+depositAmt);
		viewBalance();
		}
		
	}
	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double,String>m:ministatement.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}
	

}
