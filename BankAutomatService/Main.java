public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(100);
        ATMService atm = new ATM(account);

        try {
            atm.withdraw(150); // ❌ Exception
            System.out.println("Neuer Kontostand: " + account.getBalance());

        } catch (InsufficientFundsException e) {
            System.out.println("FEHLER: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Ungültige Eingabe: " + e.getMessage());

        } finally {
            System.out.println("Vielen Dank für Ihren Besuch.");
        }

        // ❌ ERROR – NUR ZUR DEMO (nicht behandeln!)
        // causeStackOverflow();
    }

    // simuliert einen ERROR
    static void causeStackOverflow() {
        causeStackOverflow(); // StackOverflowError
    }


}
