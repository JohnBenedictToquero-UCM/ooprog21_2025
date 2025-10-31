import java.text.DecimalFormat;
import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial balance: ");
        double balance = scanner.nextDouble();

        double interestRate = 0.03;
        int year = 1;
        int userChoice;

        do {
            balance += balance * interestRate;

            DecimalFormat formatter = new DecimalFormat("0.00##");
            String formattedBalance = formatter.format(balance);

            System.out.printf("After year %d at %.2f interest rate, balance is $%s%n", year, interestRate, formattedBalance);

            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes\n");
            System.out.print("   or any other number for no >> ");
            userChoice = scanner.nextInt();

            if (userChoice == 1) {
                year++;
            }

        } while (userChoice == 1);
        
        scanner.close();
    }
}

