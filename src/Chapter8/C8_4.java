
/**
 * Program that prints out an array
 *
 * @author Nick Chen
 */
import java.util.Scanner;

public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        //initialize variables
        Scanner input = new Scanner(System.in);
        //initialize array
        int[][] numArray = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9},};
        //print array
        System.out.printf("%-12s%-3s%-3s%-3s%-3s%-3s%-3s%-3s%-3s", "", "Su", "M", "T", "W", "Th", "F", "Sa", "Tot");
        for (int row = 0; row < numArray.length; row++) {
            System.out.printf("%n%-11s|", "Employee " + row);
            int total = 0;
            for (int column = 0; column < numArray[row].length; column++) {
                System.out.printf("%-3d", numArray[row][column]);
                total += numArray[row][column];
            }
            System.out.print(total);
        }
    }
}
