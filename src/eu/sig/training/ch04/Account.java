package eu.sig.training.ch04;

public class Account {
	
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
        // 3. Look up counter account and make transfer object:
        CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
        Transfer result = new Transfer(new TransferParameter(this, acct, amount));
        return result;
    }

}
