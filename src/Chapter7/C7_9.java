package Chapter7;

import java.util.Scanner;

/**
 * Program that finds the minimum number in a number set
 *
 * @author Nick Chen
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        //initialization
        Scanner input = new Scanner(System.in);
        double[] values = new double[10];
        //loop: prompt for 10 values
        System.out.print("Please input 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            values[i] = input.nextDouble();
        }
        //invoke method
        System.out.println("The minimum number is: " + min(values));
    }

    /**
     * Method that checks for the minimum value within an array
     *
     * @param values the array used by the method
     * @return the minimum value within the array
     */
    public static double min(double[] values) {
        double minVal = values[0];
        for (double value : values) {
            if (value < minVal) {
                minVal = value;
            }
        }
        return minVal;
    }
}
