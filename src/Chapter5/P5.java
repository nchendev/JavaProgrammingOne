package Chapter5;

import java.util.Scanner;

/**
 * Program that counts yes/no votes
 *
 * @author Nick Chen
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans = "";
        int yes = 0, no = 0;
        while (!ans.equals("q") && !ans.equals("Q")) {
            System.out.println("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting: ");
            ans = input.next();
            if (ans.equals("Y") || ans.equals("y")) {
                yes += 1;
            } else if (ans.equals("N") || ans.equals("n")) {
                no += 1;
            } else {
                System.out.println("INVALID CODE: Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
            }
        }
        System.out.println(yes + " yes and " + no + " no");
    }
}
