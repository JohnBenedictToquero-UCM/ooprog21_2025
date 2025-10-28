import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = scanner.nextDouble();

        double interestRate = 0.03;
        int continueLoop = 1;

        while (continueLoop == 1) {
            System.out.println("Do you want to see next year's balance?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            continueLoop = scanner.nextInt();

            if (continueLoop == 1) {
                balance += balance * interestRate;
                System.out.printf("After year 1 at 0.03 interest rate, balance is $%.1f\n", balance);

                System.out.println("\nDo you want to see the balance at the end of another year?");
                System.out.print("Enter 1 for yes or any other number for no >> ");
                continueLoop = scanner.nextInt();
                System.out.println(); 
            }
        }

        scanner.close();
    }
}
