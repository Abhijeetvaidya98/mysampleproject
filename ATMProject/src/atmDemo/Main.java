package atmDemo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// creating constructor for atmoperation
		AtmOperations op=new AtmOperationImpl();
		int atmnumber=12345;
		int atmPin=123;
		Scanner in=new  Scanner(System.in);
		System.out.println("Welcome to ATM machine!!");
		System.out.println("enter ATM number");
		int atmNumber=in.nextInt();
		System.out.println("Enter pin");
		int pin=in.nextInt();
		if((atmnumber==atmNumber)&&(atmPin==pin))
		{
			while(true)
			{
				System.out.println("1.View available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View miniStatement\n5.exit");
				System.out.println();
				System.out.println("Enter your choice:");
				int ch=in.nextInt();
				if(ch==1)
				{
					op.viewBalance();
				}
				else if(ch==2)
				{
					System.out.println("Enter the amount to withdraw");
					double withdrawAmount=in.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}
				else if(ch==3)
				{
					System.out.println("Enter Amount to Deposit :");
                    double depositAmount=in.nextDouble();//5000
                    op.depositAmount(depositAmount);
					
				}
				else if(ch==4)
				{
					op.viewMiniStatement();
				}
				else if(ch==5)
				{
					System.out.println("Collect your ATMCard\nThank you for using ATM service!!");
					System.exit(0);
					
				}
				else
				{
					System.out.println("please enter your correct choice");
				}
					
					
			}
		}
		else
		{
			System.out.println("Incorrect ATMNumber or pin");
			System.exit(0);
		}

	}

}
