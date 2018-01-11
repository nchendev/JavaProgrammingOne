package Chapter3;

import java.util.Scanner;

/**
 * Program that checks the divisibility of a number by 5 and 6
 *
 * @author Nick Chen
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String args[]) {
        System.out.print("Enter an Integer: ");
        Scanner input = new Scanner(System.in);
        int ans = input.nextInt();
        boolean bAns = false;
        if ((ans % 5 == 0) && (ans % 6 == 0)) {
            bAns = true;
        } else {
            bAns = false;
        }
        System.out.println("Is it divisble by 5 and 6? " + bAns);
        if ((ans % 5 == 0) || (ans % 6 == 0)) {
            bAns = true;
        } else {
            bAns = false;
        }

        System.out.println("Is it divisble by 5 or 6? " + bAns);
        if ((ans % 5 == 0) ^ (ans % 6 == 0)) {
            bAns = true;
        } else {
            bAns = false;
        }
        System.out.println("Is it divisble by 5 or 6, but not both? " + bAns);
    }
}
