package Chapter4;

import java.util.Scanner;

/**
 * Program that checks if a string is a substring of another string
 *
 * @author Nick Chen
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");

        String s1 = input.next();
        System.out.print("Enter string s2: ");
        String s2 = input.next();
        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
