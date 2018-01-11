package Chapter6;

import java.util.Scanner;

/**
 * Program that checks for the validity of a password based on letters, digits,
 * and character requirements
 *
 * @author Nick Chen
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password: ");
        String password = input.next();
        if (test1(password) && test2(password) && test3(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid");
        }
    }

    public static Boolean test1(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            System.out.println("A password must have at least eight characters");
            return false;
        }
    }

    public static Boolean test2(String password) {
        int digCount = 0, letCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c) == true) {
                digCount += 1;
            }
            if (Character.isLetter(c) == true) {
                letCount += 1;
            }
        }
        if ((digCount + letCount) == password.length()) {
            return true;
        } else {
            System.out.println("A password must consist of only letters and digits");
            return false;
        }
    }

    public static Boolean test3(String password) {
        int counter = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                counter += 1;
            }
        }
        if (counter >= 2) {
            return true;
        } else {
            System.out.println("A password must contain at least two digits");
            return false;
        }
    }
}
