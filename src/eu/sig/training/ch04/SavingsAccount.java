package eu.sig.training.ch04;

import eu.sig.training.ch04.Money;

// tag::SavingsAccount[]
public class SavingsAccount extends Account {
    CheckingAccount registeredCounterAccount;

     protected Transfer doOn0(String counterAccount, Money amount) throws BusinessException {             // 2. Look up counter account and make transfer object:
             Transfer result = super.doOn0(counterAccount, amount);
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

