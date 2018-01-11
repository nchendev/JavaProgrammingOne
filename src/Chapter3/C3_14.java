package Chapter3;

import java.util.Scanner;

/**
 * Program that randomizes a coin flip and has a user guess the outcome
 *
 * @author Nick Chen
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String args[]) {
        System.out.println("Welcome to HEADS or TAILS!");
        System.out.println("Please input your guess(1 for heads or 2 for tails): ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        int result = (int) (Math.random() * 2);
        if (result == (guess % 2)) {
            System.out.println("Congratulations! You guessed correctly!");
        } else {
            System.out.println("Aww, better luck next time.");
        }
    }
}
