package Chapter4;

import java.util.Scanner;

/**
 * Program that asks for and displays an employees information
 *
 * @author Nick Chen
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hrWorked = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fedTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        System.out.println(" ");
        System.out.println("Employee Name: " + name);
        System.out.printf("Hours Worked: %1.2f", hrWorked);
        System.out.printf("\nPay Rate: $%1.2f", payRate);
        System.out.printf("\nGross pay: $%1.2f", hrWorked * payRate);
        System.out.println(" ");
        System.out.println("Deductions:");
        double fedWith = (hrWorked * payRate) * (fedTaxRate);
        System.out.printf("\tFederal Withholding (%1.2f%%): $%1.2f", fedTaxRate * 100, fedWith);
        double stateWith = (hrWorked * payRate) * (stateTaxRate);
        System.out.printf("\n\tState Withholding (%1.2f%%): $%1.2f", stateTaxRate * 100, stateWith);
        double totDed = fedWith + stateWith;
        System.out.printf("\n\tTotal Deduction: $%1.2f", totDed);
        double netPay = (hrWorked * payRate) - totDed;
        System.out.printf("\nNet Pay: $%1.2f", netPay);
    }
}
