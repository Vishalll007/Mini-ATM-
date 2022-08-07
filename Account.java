class Account 
{
	private String acc_hol_name;
	private int acc_no;
	private double bal;
	Account(String ahname,int acno,double bal)
	{
		this.acc_hol_name=ahname;
		this.acc_no=acno;
		this.bal=bal;
	}
	public String getName()
	{
		return acc_hol_name;
	}
	public void setName( String newName)
	{
		this.acc_hol_name=newName;
	}
	public int getAccountNo()
	{
		return acc_no;
	}
	public double getBalance(int acno)
	{
		if(this.acc_no==acno)
		{
			return bal;
		}
		else
		{
			System.out.println("Incorrect Account Number");
			return -1;
		}
	}
	public void setBalance(int acno,double newBal)
	{
		if(this.acc_no==acno)
		{
			this.bal=bal+newBal;
		}
		else
		{
			System.out.println("Incorrect Account Number");
		}
	}
	public void withDraw(int acno, double newamt)
	{
		if(this.acc_no==acno)
		{
			if(this.bal>=newamt)
			{
				this.bal=bal-newamt;
				System.out.println(newamt+" Amount Successfully Withdrawed");
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
			else
			{
				System.out.println("Incorrect Account Number");
			}
		}
		public void accountDetails()
		{
			System.out.println("Account Holder Name ="+acc_hol_name);
			System.out.println("Account Number ="+acc_no);
			System.out.println("Account Balance ="+bal);
		}
	}
	