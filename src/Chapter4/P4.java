package Chapter4;

import java.util.Scanner;

/**
 * Program that compares the offers of two construction companies
 *
 * @author Nick Chen
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The details asked for below concern the first bidder");
        System.out.print("First bidder, what is your name? ");
        String b1Name = input.next();
        System.out.print(b1Name + ", how many hours of work will you require? ");
        int b1Hours = input.nextInt();
        System.out.print(b1Name + ", how much do you charge per hour? $");
        double b1Rate = input.nextDouble();

        System.out.println("");

        System.out.println("The details asked for below concern the second bidder");
        System.out.print("Second bidder, what is your name? ");
        String b2Name = input.next();
        System.out.print(b2Name + ", how many hours of work will you require? ");
        int b2Hours = input.nextInt();
        System.out.print(b2Name + ", how much do you charge per hour? $");
        double b2Rate = input.nextDouble();

        //Calculations and Results
        double b1Cost = b1Hours * b1Rate;
        double b2Cost = b2Hours * b2Rate;
        if (b1Cost < b2Cost) {
            System.out.printf(b1Name + ", I've chosen your service with your cost of $%5.2f", b1Cost);
        } else if (b1Cost > b2Cost) {
            System.out.printf(b2Name + ", I've chosen your service with your cost of $%5.2f", b2Cost);
        } else if (b1Cost == b2Cost) {
            if (b1Hours < b2Hours) {
                System.out.printf(b1Name + ", I've chosen your service with your cost of $%1.2f since you are faster(" + b1Hours + " hours).", b1Cost);
            } else if (b1Hours > b2Hours) {
                System.out.printf(b2Name + ", I've chosen your service with your cost of $%1.2f since you are faster(" + b2Hours + " hours).", b1Cost);
            } else if (b1Hours == b2Hours) {
                System.out.printf(b1Name + ", " + b2Name + ", Your services have the same cost: $%1.2f. You both cost $%1.2f"
                        + " per hour, and you both will take %d hours to finish, "
                        + "and will cost $%1.2f each.", b1Cost, b1Rate, b1Hours, b1Cost);
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
