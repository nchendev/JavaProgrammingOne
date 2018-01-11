package Chapter2;

import java.util.Scanner;

/**
 * Program that calculates the gratuity and the total bill
 *
 * @author Nick Chen
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratRate = input.nextDouble();
        System.out.println("The gratuity is " + subtotal * (gratRate / 100.0)
                + " and the total is $" + subtotal * ((gratRate + 100) / 100.0));
    }
}
