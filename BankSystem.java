import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\n--- Simple Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String number = scanner.nextLine();
                    account = new BankAccount(name, number);
                    System.out.println("Account created successfully!");
                    break;
                case 2:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                    } else {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    }
                    break;
                case 3:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                    } else {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    }
                    break;
                case 4:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                    } else {
                        System.out.println("Current Balance: " + account.getBalance());
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the banking system!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}