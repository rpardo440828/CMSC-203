
public class CheckingAccount extends BankAccount
{
	private final double FEE = .15;
	
	public CheckingAccount(String name, double initialAmount)
	{
		super(name, initialAmount);
		super.setAccountNumber(super.getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		double amountWithFee = amount + FEE;
		boolean status = super.withdraw(amountWithFee);
		
		return status;
	}
}
