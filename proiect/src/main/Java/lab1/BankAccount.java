package lab1;

public class BankAccount {
    private double balance;
    private final String IBAN;
    private final String CNP;

    public BankAccount(double initialBalance, String IBAN, String CNP) {
        this.balance = initialBalance;
        this.IBAN = IBAN;
        this.CNP = CNP;
    }

    // Metoda standard de depunere
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depunere reușită! Sold actual: " + balance);
    }

    // Overloading: Metodă care permite să nu afișăm mesajul
    public void deposit(double amount, boolean silent) {
        balance += amount;
        if (!silent) {
            System.out.println("Depunere reușită! Sold actual: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Tranzacție reușită! Happy Case");
        } else {
            System.out.println("Fonduri insuficiente!");
        }
    }

    public void checkBalance() {
        System.out.println("Soldul contului: " + balance);
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getCNP() {
        return CNP;
    }

    public double getBalance() {
        return balance;
    }
}
