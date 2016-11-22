package eu.sig.training.ch04;

import eu.sig.training.ch04.Money;

// tag::SavingsAccount[]
public class SavingsAccount {
    CheckingAccount registeredCounterAccount;

    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
        // 1. Assuming result is 9-digit bank account number, validate 11-test:
        int sum = Utils.calcChkSum(counterAccount);
        if (sum % 11 == 0) {
        	return doOn0(counterAccount, amount);
        } else {
            throw new BusinessException("Invalid account number!!");
        }
    }   
     protected Transfer doOn0(String counterAccount, Money amount) throws BusinessException {
             // 2. Look up counter account and make transfer object:
             CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
             Transfer result = new Transfer(this, acct, amount); // <2>
             // 3. Check whether withdrawal is to registered counter account:
             if (result.getCounterAccount().equals(this.registeredCounterAccount)) 
             {
                 return result;
             } else {
                 throw new BusinessException("Counter-account not registered!");
             }
     }

     
    


}
// end::SavingsAccount[]

