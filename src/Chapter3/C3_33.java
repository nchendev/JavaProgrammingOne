package Chapter3;

import java.util.Scanner;

/**
 * Program that compares the efficiency of two prices by weight and price
 *
 * @author Nick Chen
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double p1weight = input.nextDouble();
        double p1cost = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double p2weight = input.nextDouble();
        double p2cost = input.nextDouble();
        double p1Eff = p1cost / p1weight;
        double p2Eff = p2cost / p2weight;
        if (p1Eff < p2Eff) {
            System.out.println("Package 1 has the better price.");
        } else if (p2Eff < p1Eff) {
            System.out.println("Package 2 has the better price.");
        } else if (p1Eff == p2Eff) {
            System.out.println("Both packages have the same price.");
        }
    }
}
