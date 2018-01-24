package Chapter7;

import java.util.Scanner;

/**
 * Program that compares two lists
 *
 * @author Nick Chen
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        //initialization
        Scanner input = new Scanner(System.in);
        //loop1
        System.out.print("Enter list1: ");
        int l1 = input.nextInt();
        int[] list1 = new int[l1];
        for (int i = 0; i < l1; i++) {
            list1[i] = input.nextInt();
        }
        //loop2
        System.out.print("Enter list1: ");
        int l2 = input.nextInt();
        int[] list2 = new int[l1];
        for (int i = 0; i < l2; i++) {
            list2[i] = input.nextInt();
        }
        //execute method
        if (equals(list1, list2, l1, l2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }
    }

    /**
     * Method that checks whether two arrays are equal to each other
     *
     * @param list1 the first array
     * @param list2 the second array
     * @param l1 number of items within the first array
     * @param l2 number of items within the second array
     * @return whether the two lists are equal
     */
    public static boolean equals(int[] list1, int[] list2, int l1, int l2) {
        if (l1 != l2) {
            return false;
        }
        for (int i = 0; i < l1; i++) {
            if (!(list1[i] == list2[i])) {
                return false;
            }
        }
        return true;
    }
}
