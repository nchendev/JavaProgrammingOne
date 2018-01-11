package Chapter2;

import java.util.Scanner;

/**
 * Program to convert degrees in Celcius to Fahrenheit
 *
 * @author Nick Chen
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String args[]) {
        System.out.println("Enter a degree in Celcius: ");
        Scanner input = new Scanner(System.in);
        double celcius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celcius + 32;
        System.out.println(celcius + " degrees celcius is " + fahrenheit + " fahrenheit");
    }
}
