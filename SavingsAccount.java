class SavingsAccount
{
    static double annualinterest;
    double savingsbalance;
	public SavingsAccount(double balance) 
	{
		savingsbalance=balance;
		annualinterest=0;
	}
	public void calculateMonthlyInterestRate()
	 {
		System.out.println("current balance:"+savingsbalance);
		double monthlyinterest;
		monthlyinterest=(savingsbalance*annualinterest)/12;
		savingsbalance=savingsbalance+monthlyinterest;
		System.out.println("new balance:"+savingsbalance);
	}
	double getbalance() 
	{
		return savingsbalance;
	}

    void modifyInterest(double new_interest) 
	{
    	annualinterest=new_interest;
	}
}

