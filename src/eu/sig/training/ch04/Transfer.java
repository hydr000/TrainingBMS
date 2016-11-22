package eu.sig.training.ch04;

import eu.sig.training.ch04.Money;

public class Transfer {
    CheckingAccount counterAccount;
    
    public Transfer(Account acct1, Account acct2, Money m) {}

    public CheckingAccount getCounterAccount() {
        return this.counterAccount;
    }
}
