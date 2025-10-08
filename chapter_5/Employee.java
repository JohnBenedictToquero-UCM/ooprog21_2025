public class Employee {
    private int employeeNumber;
    private double payRate;
    private final int maxEmployeeNumber = 9999;
    private final double maxPayRate = 60.00;
    private final double overtimeMultiplier = 1.5;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > maxEmployeeNumber)
            this.employeeNumber = maxEmployeeNumber;
        else
            this.employeeNumber = employeeNumber;

        if (payRate < maxPayRate)
            this.payRate = maxPayRate;
        else
            this.payRate = payRate;
    }

    public double computeRegularPay(double hoursWorked) {
        if (hoursWorked > 40)
            return 40 * payRate;
        else
            return hoursWorked * payRate;
    }

    public double computeOvertimePay(double hoursWorked) {
        if (hoursWorked > 40)
            return (hoursWorked - 40) * payRate * overtimeMultiplier;
        else
            return 0;
    }
}
