package lab1;

public class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance, String IBAN, String CNP) {
        super(initialBalance, IBAN, CNP);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        System.out.println("Retragere efectuată din contul curent.");
    }
}
