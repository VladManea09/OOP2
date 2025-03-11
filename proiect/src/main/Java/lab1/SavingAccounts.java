package lab1;

public class SavingAccounts extends BankAccount {
    private static final double INTEREST_RATE = 0.05; // 5% dobândă

    public SavingAccounts(double initialBalance, String IBAN, String CNP) {
        super(initialBalance, IBAN, CNP);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        System.out.println("Retragere efectuată din contul de economii.");
    }

    // Aplică dobândă
    public void applyInterest() {
        double interest = getBalance() * INTEREST_RATE;
        deposit(interest, true); // Overloading: depunere fără mesaj
        System.out.println("Dobândă aplicată: " + interest);
    }
}
