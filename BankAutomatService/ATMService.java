public interface ATMService {
    void withdraw(double amount) throws InsufficientFundsException;
}
