import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = input.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double payRate = input.nextDouble();

        // Create Employee object (employee number not required for output)
        Employee employee = new Employee(1234, payRate);

        double regularPay = employee.computeRegularPay(hoursWorked);
        double overtimePay = employee.computeOvertimePay(hoursWorked);

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
    }
}
