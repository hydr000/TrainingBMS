package eu.sig.training.ch04;

import eu.sig.training.ch04.Money;

// tag::CheckingAccount[]
public class CheckingAccount {
    private int transferLimit = 100;

    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {
        // 1. Check withdrawal limit:
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }
        // 2. Assuming result is 9-digit bank account number, validate 11-test:
        int sum = Utils.calcChkSum(counterAccount);
        if (sum % 11 == 0) {
            return doOn0(counterAccount, amount);
        } else {
            throw new BusinessException("Invalid account number!");
        }
    }
    
    protected Transfer doOn0(String counterAccount, Money amount) throws BusinessException {
        // 3. Look up counter account and make transfer object:
        CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
        Transfer result = new Transfer(this, acct, amount);
        return result;
    }

}
// end::CheckingAccount[]
