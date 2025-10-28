import java.util.Scanner;

public class DebugSix1 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int days;
        double money = 0.01;
        int day = 1;

        System.out.print("Enter number of days >> "); // added semicolon
        days = keyboard.nextInt();

        while (day <= days) { // fix condition
            money = 2 * money;             ++day;
            System.out.println("After day " + day + " you have " + money);

        }
    }
}
