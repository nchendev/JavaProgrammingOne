package Chapter2;

import java.util.Scanner;

/**
 * Program that calculates the total price of a meal
 *
 * @author nc0967554
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String args[]) {
        System.out.println("            Total Price of Meal Calculator");
        double meal, drinks, dessert, food, tax, tip, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price of meal: ");
        meal = input.nextDouble();
        System.out.print("Enter price of drinks: ");
        drinks = input.nextDouble();
        System.out.print("Enter price of dessert: ");
        dessert = input.nextDouble();
        food = meal + drinks + dessert;
        tax = food * (.10);
        tip = (food + tax) * (.15);
        total = food + tax + tip;
        System.out.println(" ");
        System.out.println("           RESULTS");
        System.out.println("food: $" + food);
        System.out.println("tax: $" + tax);
        System.out.println("tip: $" + tip);
        System.out.println("total: $" + total);

    }
}
