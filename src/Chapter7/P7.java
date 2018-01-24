package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program that checks for the average value within an array of numbers
 *
 * @author Nick Chen
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        //initialization
        Scanner input = new Scanner(System.in);
        //query user for # of #s & create array of that size
        System.out.println("How many numbers would you like read in? ");
        int size = input.nextInt();
        //call void fillArray method
        double[] array1 = new double[size];
        /**
         * array1 =*
         */
        fillArray(array1);
        //call arrayAvg method
        System.out.println("The average of the array values is " + arrayAvg(array1));
        //call void printArray method
        System.out.println("The contents of the array: ");
        printArray(array1);
    }

    /**
     * Method that fills the array with values
     *
     * @param array1 the array used by the method
     */
    public static void fillArray(double[] array1) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the " + array1.length + " numbers: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextDouble();
        }
    }

    /**
     * Method that calculates the average value within an array
     *
     * @param array1 the array used by the method
     * @return the average value of the array
     */
    public static double arrayAvg(double[] array1) {
        double tot = 0;
        for (double num : array1) {
            tot += num;
        }
        return tot / array1.length;
    }

    /**
     * Method that prints the array out in console
     *
     * @param array1 the array used by the method
     */
    public static void printArray(double[] array1) {
        System.out.println(Arrays.toString(array1));
    }
}
