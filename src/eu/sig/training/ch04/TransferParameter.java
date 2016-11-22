package eu.sig.training.ch04;

public class TransferParameter {
	public Account acct1;
	public Account acct2;
	public Money m;

	public TransferParameter(Account acct1, Account acct2, Money m) {
		this.acct1 = acct1;
		this.acct2 = acct2;
		this.m = m;
	}
}