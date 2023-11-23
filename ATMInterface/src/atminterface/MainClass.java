package atminterface;
import java.util.Scanner;

public class MainClass {
	public static void main(String args[])
	{
		ATMOperationInterface op=new ATMOperations();
		int atmNumber=27112003;
		int atmpin=1727;
		Scanner in=new Scanner(System.in);
		System.out.println("WELCOME!!");
		System.out.println("Enter the ATM Number:");
		int atmNumber1=in.nextInt();
		System.out.println("Enter PIN:");
		int atmpin1=in.nextInt();
		if((atmNumber==atmNumber1)&&(atmpin==atmpin1))
		{
			while(true)
			{
				System.out.println(" 1.View Available Balance: \n 2.Withdraw Amount: \n 3.Deposit Amount: \n 4.View Ministatement: \n 5.Exit");
				System.out.println("Enter the Operation you want to Perform:");
				int ch=in.nextInt();
				if(ch==1)
				{
					op.viewBalance();
				}
				else if(ch==2)
				{
					System.out.println("Enter the Amount you want to Withdraw:");
					double withdrawAmt=in.nextDouble();
					op.withdrawAmt( withdrawAmt);
				}
				else if(ch==3)
				{
					System.out.println("Enter the Amount you want to Deposit:");
					double depositAmt=in.nextDouble();
					op.depositAmt(depositAmt);
				}
				else if(ch==4)
				{
					op.viewMiniStatement();
				}
				else if(ch==5)
				{
					System.out.println("Pickup your Card.");
					System.exit(0);
				}
				else
				{
					System.out.println("Please enter the correct Choice.");
				}
			}
		}
		else
		{
			System.out.println("Invalid ATM Number or ATM PIN!!!");
			System.exit(0);
		}
		
	}
}
