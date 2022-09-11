
public class SavingsAccountTest {
	public static void main(String args[]) 
	{
		SavingsAccount s1=new SavingsAccount(2000);
		SavingsAccount s2=new SavingsAccount(3000);
		s1.modifyInterest(0.04);
		s1.calculateMonthlyInterestRate();
		s2.modifyInterest(0.04);
		s2.calculateMonthlyInterestRate();
		System.out.println("after changing interest rate from 4% to 5%");
		s1.modifyInterest(0.05);
		s1.calculateMonthlyInterestRate();
		s2.modifyInterest(0.05);
		s2.calculateMonthlyInterestRate();
	}

}
