public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    @Override
    public String withdraw(double amount) throws InsufficientFundsException {
        account.withdraw(amount);
        System.out.println("Bitte entnehmen Sie Ihr Geld");
        return "";
    }
}

