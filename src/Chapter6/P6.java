package Chapter6;

import java.util.Scanner;

/**
 * Program that converts currencies (Dollars to Euros, Pound Sterlings, Yen)
 * based on ratios that the user supplies
 *
 * @author Nick Chen
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("How many Euros will a dollar buy?");
        double euroConv = input.nextDouble();
        System.out.println("How many Pound Sterlings will a dollar buy?");
        double psConv = input.nextDouble();
        System.out.println("How many Yen will a dollar buy?");
        double yenConv = input.nextDouble();
        Boolean cont = true;
        while (cont) {
            String ans = "-";
            String ans2 = "-";
            String ansS = "-";
            double convCur = 0;
            System.out.println("Number of dollars to convert?: ");
            double dollars = input.nextDouble();
            System.out.println("What currency would you like to buy? enter"
                    + "“E” to buy Euros, “P” to buy Pounds, or “Y” to buy Yen");
            ans = input.next();
            ans = ans.toLowerCase();
            while (!ans.equals("e") && !ans.equals("p") && !ans.equals("y")) {
                System.out.println("Invalid entry; please try again.Enter"
                        + "“E” to buy Euros, “P” to buy Pounds, or “Y” to buy Yen");
                ans = input.next();
                ans = ans.toLowerCase();
            }
            if (ans.equals("e")) {
                convCur = Conversion(dollars, euroConv);
            } else if (ans.equals("p")) {
                convCur = Conversion(dollars, psConv);
            } else if (ans.equals("y")) {
                convCur = Conversion(dollars, yenConv);
            }
            switch (ans) {
                case ("e"):
                    ansS = "Euros";
                    break;
                case ("p"):
                    ansS = "Pounds Sterlings";
                    break;
                case ("y"):
                    ansS = "Yen";
                    break;
            }
            System.out.printf("%1.2f dollars can buy %1.2f " + ansS + "\n", dollars, convCur);
            while (!ans2.equals("yes") && !ans2.equals("no")) {
                System.out.println("Are there more conversions to perform? Enter yes/no: ");
                ans2 = input.next().toLowerCase();
            }
            if (ans2.equals("no")) {
                cont = false;
            }
        }
    }
    /**
     * Method that converts dollars into the secondary currency
     * 
     * @param dollar the amount of dollars, in double
     * @param convFactor the conversion rate that depends on which type of currency, in double
     * @return the converted currency amount
     */
    public static double Conversion(double dollar, double convFactor) {
        if (dollar > 100.0) {
            dollar *= .95;
        } else {
            dollar *= .90;
        }
        double total = dollar * convFactor;
        return total;
    }
    //
}
