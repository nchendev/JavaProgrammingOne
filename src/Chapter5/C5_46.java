package Chapter5;

import java.util.Scanner;

/**
 * Program that prints out a "staircase" of an inputted string
 *
 * @author Nick Chen
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String forward = input.nextLine();
        System.out.println("");
        for (int i = forward.length() - 1; i >= 0; i--) {
            System.out.print(forward.substring(i, i + 1));
        }

    }
}
