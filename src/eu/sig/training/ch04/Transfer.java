package eu.sig.training.ch04;

public class Transfer {
    CheckingAccount counterAccount;
    
    public Transfer(TransferParameter parameterObject) {}

    public CheckingAccount getCounterAccount() {
        return this.counterAccount;
    }
}
