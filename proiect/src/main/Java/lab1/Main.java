package lab1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.println("Introduceți IBAN-ul contului:");
        String IBAN = scanner.next();  // Citim IBAN-ul

        System.out.println("Introduceți CNP-ul:");
        String CNP = scanner.next();  // Citim CNP-ul


        System.out.println("Selectați tipul de cont:");
        System.out.println("1 - Cont de Economii");
        System.out.println("2 - Cont Curent");

        int accountType = scanner.nextInt();

        // Creăm un cont în funcție de tipul ales
        BankAccount account;
        if (accountType == 1) {
            account = new SavingAccounts(1000, IBAN, CNP);
        } else {
            account = new CurrentAccount(1000, IBAN, CNP);
        }

        boolean running = true;
        while (running) {

            System.out.println("\nMeniu:");
            System.out.println("1 - Depunere bani");
            System.out.println("2 - Retragere bani");
            System.out.println("3 - Verificare sold");
            System.out.println("4 - Ieșire");
            System.out.print("Alegeți o opțiune: ");

            int choice = scanner.nextInt();

            // Executăm opțiunea aleasă de utilizator
            switch (choice) {
                case 1:
                    System.out.println("Introduceți suma de depus:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("Introduceți suma de retras:");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Mulțumim pentru utilizarea serviciului nostru! La revedere!");
                    running = false;
                    break;

                default:
                    System.out.println("Opțiune invalidă! Vă rugăm să introduceți un număr între 1 și 4.");
            }
        }
        scanner.close();
    }
}
