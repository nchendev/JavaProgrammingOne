
/**
 * Program that prints out an array
 *
 * @author Nick Chen
 */
import java.util.Scanner;

public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        //initialize vars
        Scanner input = new Scanner(System.in);
        String ans = "y";
        //2d double table: rows = salesmen, columns represent days
        double[][] table = {
            {0, 0, 0, 0, 0}, //A
            {0, 0, 0, 0, 0}, //B
            {0, 0, 0, 0, 0}, //C
            {0, 0, 0, 0, 0}, //D
        };
        //loop through runs
        while (ans.equals("y")) {
            addValue(input, table);
            System.out.println("More data? Enter Y for more or N to stop.");
            ans = input.next().toLowerCase();
        }
        System.out.println("success");
        //printarrays
        printArray(table);
    }

    /**
     * Method for adding values to the 2d array
     *
     * @param input Scanner
     * @param table the array used by the method
     */
    public static void addValue(Scanner input, double[][] table) {

        System.out.println("Enter the salesman ID as A, B, C, or D: ");
        String salesman = input.next().toUpperCase();
        System.out.println("Enter the day as M, T, W, H, or F");
        String day = input.next().toUpperCase();
        System.out.println("Enter the amount of for sale " + salesman + " on " + day + ": ");
        double amount = input.nextDouble();
        table = fillArray(table, salesman, day, amount);
    }

    /**
     * Method that compares each input (ID vs Day)
     *
     * @param table the array used by the method
     * @param salesman the name of the salesman
     * @param day the day that's being processed
     * @param amount the amount the salesman was paid that day
     * @return
     */
    public static double[][] fillArray(double[][] table, String salesman, String day, double amount) {
        //initialize vars
        int row = 0;
        int column = 0;
        //determine row(salesman)
        switch (salesman) {
            case "A":
                row = 0;
                break;
            case "B":
                row = 1;
                break;
            case "C":
                row = 2;
                break;
            case "D":
                row = 3;
                break;
        }
        //determine column(day)
        switch (day) {
            case "M":
                column = 0;
                break;
            case "T":
                column = 1;
                break;
            case "W":
                column = 2;
                break;
            case "H":
                column = 3;
                break;
            case "F":
                column = 4;
                break;
        }
        table[row][column] = amount;
        return table;
    }

    /**
     * Method that prints out the array to console
     *
     * @param table the array used by the method
     */
    public static void printArray(double[][] table) {
        System.out.println("");
        System.out.printf("%-10s %-5s %-5s %-5s %-5s %-5s\n", "Salesman", "M", "T", "W", "H", "F");
        for (int i = 0; i < table.length; i++) {
            switch (i) {
                case (0):
                    System.out.printf("%5s%6s", "A", "");
                    break;
                case (1):
                    System.out.printf("%5s%6s", "B", "");
                    break;
                case (2):
                    System.out.printf("%5s%6s", "C", "");
                    break;
                case (3):
                    System.out.printf("%5s%6s", "D", "");
                    break;
            }
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("%-4.2f ", table[i][j]);
            }
            System.out.println("\n");
        }
    }
}
