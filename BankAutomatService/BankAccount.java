public class BankAccount {

    private double balance; //Kapselung

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    void withdraw(double amout) throws InsufficientFundsException {
        if (amout <= 0) {
            throw new IllegalArgumentException("Betrag muss positiv sein");
        }
        if (amout > balance) {
            throw new InsufficientFundsException("nicht genug Guthaben");
        }
        balance -= amout;
    }
}
