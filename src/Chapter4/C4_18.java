package Chapter4;

import java.util.Scanner;

/**
 * Program that converts abbreviations of majors and grade
 *
 * @author Nick Chen
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter two characters: ");
        Scanner input = new Scanner(System.in);
        String ans = input.next();
        ans = ans.toUpperCase();
        char majorL = ans.charAt(0);
        String major = "";
        Boolean invalid = false;
        switch (majorL) {
            case 'M':
                major = "Mathematics";
                break;
            case 'C':
                major = "Computer Science";
            case 'I':
                major = "Information Technology";
            default:
                invalid = true;
        }
        char yearNum = ans.charAt(1);
        String year = "";
        switch (yearNum) {
            case '1':

                year = "Freshman";
                break;
            case '2':
                year = "Sophmore";
                break;
            case '3':
                year = "Junior";
                break;
            case '4':
                year = "Senior";
                break;
            default:
                invalid = true;
        }
        if (invalid == false) {
            System.out.println(major + " " + year);
        } else {
            System.out.println("Invalid input");
        }
    }
}
