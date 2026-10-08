import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FinanceManager manager = new FinanceManager();

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n--- Student Finance Tracker ---");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Category: ");
                String category = scanner.nextLine();

                System.out.print("Description: ");
                String description = scanner.nextLine();

                System.out.print("Amount: £");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                Transaction transaction =
                        new Transaction("Income", category, description, amount);

                manager.addTransaction(transaction);

                System.out.println("Income added.");

            } else if (choice == 2) {

                System.out.print("Category: ");
                String category = scanner.nextLine();

                System.out.print("Description: ");
                String description = scanner.nextLine();

                System.out.print("Amount: £");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                Transaction transaction =
                        new Transaction("Expense", category, description, amount);

                manager.addTransaction(transaction);

                System.out.println("Expense added.");

            } else if (choice == 3) {

                System.out.println(
                        "Current Balance: £" + manager.calculateBalance());

            } else if (choice == 4) {

                manager.viewTransactions();

            } else if (choice == 5) {

                System.out.println("Goodbye!");

            } else {

                System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}