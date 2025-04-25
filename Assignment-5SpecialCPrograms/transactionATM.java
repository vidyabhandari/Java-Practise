import java.util.Scanner;

public class transactionATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long amount = 1000;
        long deposit, withdraw;
        int choice, pin = 0;
        char transaction;
        boolean exit = false;

        // person1 pin = 1234
        while (pin != 1234) { // 
            System.out.print("Enter your secret pin number: ");
            pin = sc.nextInt();

            if (pin != 1234) {
                System.out.println("Please enter valid password \n");
            }
        }

        do {
            System.out.println(" Welcome to ATM Service ");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Quit");
            System.out.println();

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Your Balance in Rs: " + amount);
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    withdraw = sc.nextInt();

                    if (withdraw % 100 != 0) {
                        System.out.println("PLEASE Enter the amount in multiples of 100");
                    } else if (withdraw > (amount - 500)) {
                        System.out.println("INSUFFICIENT BALANCE");
                    } else {
                        amount = amount - withdraw;
                        System.out.println("Please collect Cash!");
                        System.out.println("Your Current Balance is: " + amount);
                    }
                    break;

                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    deposit = sc.nextLong();
                    amount = amount + deposit;
                    System.out.println("Your Balance is: " + amount);
                    break;

                case 4:
                    System.out.println("THANK YOU FOR USING ATM!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            if (!exit) {
                System.out.print("\n Do you wish to have another transaction? (y/n): ");
                transaction = sc.next().charAt(0);

                if (transaction == 'n' || transaction == 'N') {
                    exit = true;
                }
            }
        } while (!exit);

        System.out.println("\n THANKS FOR USING ATM SERVICE!");
    }
}