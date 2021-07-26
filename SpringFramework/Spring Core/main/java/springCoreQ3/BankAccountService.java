
package springCoreQ3;

public interface BankAccountService {

	public double wihtdraw(long accountId, double amount);

	public double deposit(long accountId, double newBalance);

	public double getBalance(long accountId);

	public boolean fundTransfer(long fromAccount, long toAccount, double amount);

}