package Chapter5;

import java.util.Scanner;

/**
 * Program that simulates Rock/Paper/Scissors
 *
 * @author Nick Chen
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    //Scissor (0). rock (1), paper (2)
    public static void main(String[] args) {
        int cStreak = 0, pStreak = 0;
        while (cStreak != (pStreak - 2) && pStreak != (cStreak - 2)) {
            System.out.println("Scissor (0). rock (1), paper (2): ");
            Scanner input = new Scanner(System.in);
            int pAns = input.nextInt();
            int cAns = (int) (Math.random() * 3);
            int winner = 0; //0== draw, 1== pWon, 2== cWon
            String winningLine = "It is a draw.";
            String cAnsStr;
            String pAnsStr;
            if (pAns == cAns) {
                winner = 0;
                winningLine = "It is a draw.";
            } else if ((pAns - 1) == cAns) {
                winner = 1;
                winningLine = "You won.";
            } else if ((cAns - 1) == pAns) {
                winner = 2;
                winningLine = "The computer won.";
            } else if (cAns == 2) {
                if (pAns == 0) {
                    winner = 1;
                    winningLine = "You won.";
                } else if (pAns == 1) {
                    winner = 2;
                    winningLine = "The computer won.";
                }
            } else if (pAns == 2) {
                if (cAns == 0) {
                    winner = 2;
                    winningLine = "The computer won.";
                } else if (cAns == 1) {
                    winner = 1;
                    winningLine = "You won.";
                }
            }
            //guesses to string
            switch (cAns) {
                case 0:
                    cAnsStr = "scissor";
                    break;
                case 1:
                    cAnsStr = "rock";
                    break;
                case 2:
                    cAnsStr = "paper";
                    break;
                default:
                    cAnsStr = "invalid";
                    break;
            }
            switch (pAns) {
                case 0:
                    pAnsStr = "scissor";
                    break;
                case 1:
                    pAnsStr = "rock";
                    break;
                case 2:
                    pAnsStr = "paper";
                    break;
                default:
                    pAnsStr = "invalid";
                    break;
            }
            System.out.println("The computer is " + cAnsStr + ". You are " + pAnsStr + ". " + winningLine);
            switch (winner) {
                case 1:
                    pStreak += 1;
                    break;
                case 2:
                    cStreak += 1;
                    break;
            }
            System.out.println("Player:" + pStreak + " to Computer:" + cStreak);
        }
    }
}
