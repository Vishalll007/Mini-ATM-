import java.util.Scanner;
class AccountDriver
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		boolean cond=true;
		Account ac=null;
		while(cond)
		{
		System.out.println("Enter Your Choice");
		System.out.println("1) Create Account");
		System.out.println("2) Check Balance");
		System.out.println("3) Deposit Amount");
		System.out.println("4) Withdraw Amount");
		System.out.println("5) Exit");
		int choice=s.nextInt();
		switch(choice)
			{
			case 1:
				{
				if(ac==null)
					{
					System.out.println("Enter Your Name");
					String name=s.next();
					System.out.println("Enter Account Number");
					int acno=s.nextInt();
					System.out.println("Enter Balance Amount");
					double bal=s.nextDouble();
					ac=new Account(name,acno,bal);
					System.out.println("Account Successfully Created");
					}
					else
					{
						System.out.println("Account Already Exists");
					}
				}
				break;
				case 2:
				{
					if(ac!=null)
					{
						System.out.println("Enter Your Account Number");
						int acno=s.nextInt();
						System.out.println(ac.getBalance(acno));
						}
						else
					{
							System.out.println("First Create Account Later Check Balance");
					}
				}
				break;
				case 3:
				{
					if(ac!=null)
					{
						System.out.println("Enter Your Account Number");
						int acno=s.nextInt();
						System.out.println("Enter a Amount To Be Deposited");
						double amt=s.nextDouble();
						ac.setBalance(acno,amt);
						System.out.println("Your Amount Successfully Deposited");
					}
					else
					{
						System.out.println("First Create Account Later Deposit Amount");
					}
				}
				break;
				case 4:
				{
					if(ac!=null)
					{
						System.out.println("Enter Your Account Number");
						int acno=s.nextInt();
						System.out.println("Enter Amount To Be Withdrawed");
						double amt=s.nextDouble();
						ac.withDraw(acno,amt);
					}
					else
					{
						System.out.println("First Create Account Later Withdraw Amount");
					}
				}
					break;
					case 5:
					{
						cond=false;
					}
					break;
					default:
					{
						System.out.println(" Invalid Choice");
					}
				}
		}
	}
}
			
