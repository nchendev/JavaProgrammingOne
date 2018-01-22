
/**
 * Program that assigns students a grade based on their scores
 *
 * @author Nick Chen
 */
import java.util.Scanner;

public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        //initialization
        Scanner input = new Scanner(System.in);
        int[] scores = new int[4];
        int bestScore = 0;
        char grade;
        //loop: number of students
        System.out.println("Enter the number of students: ");
        int numStu = input.nextInt();
        //loop: read student scores
        System.out.print("Enter " + numStu + " numbers: ");
        for (int i = 0; i < numStu; i++) {
            scores[i] = input.nextInt();
        }
        //loop: find best score
        for (int i : scores) {
            if (i > bestScore) {
                bestScore = i;
            }
        }
        //loop: assign grades relative to best score
        for (int i = 0; i < scores.length; i++) {
            //loop: finds grade
            if (scores[i] >= (bestScore - 10)) {
                grade = 'A';
            } else if (scores[i] >= (bestScore - 20)) {
                grade = 'B';
            } else if (scores[i] >= (bestScore - 30)) {
                grade = 'C';
            } else if (scores[i] >= (bestScore - 40)) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }
}
