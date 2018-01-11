package Chapter2;

import java.util.Scanner;

/**
 * Program that calculates the area and volume of a cylinder
 *
 * @author Nick Chen
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String args[]) {
        System.out.println("Please input the radius and length of a cylinder: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
