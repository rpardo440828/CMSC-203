
public class SavingsAccount extends BankAccount
{
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber = super.getAccountNumber();
	
	public SavingsAccount(String name, double initialAmount)
	{
		super(name, initialAmount);
		super.setAccountNumber(this.accountNumber + '-' + this.savingsNumber);
	}
	
	public SavingsAccount(SavingsAccount originalAccount, double initialAmount)
	{
		super(originalAccount, initialAmount);
		savingsNumber++;
		this.accountNumber = this.accountNumber.substring(0, this.accountNumber.length() - 2);
		super.setAccountNumber(this.accountNumber + '-' + this.savingsNumber);
	}
	
	public void postInterest()
	{
		double amount = (rate / 12) * super.getBalance();
		super.deposit(amount);
	}
	
	@Override
	public String getAccountNumber()
	{
		this.accountNumber = super.getAccountNumber();
		return this.accountNumber;
	}
}
