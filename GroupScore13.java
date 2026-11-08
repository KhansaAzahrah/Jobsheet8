package Jobsheet8;

import java.util.Scanner;

public class GroupScore13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, score;
        int bestGroup = 0;
        float totalScore, avgScore;
        float bestAvg = -1;

        i = 1;
        while (i <= 6) {
            System.out.println("Group " + i);

            totalScore = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Score from Rater Group " + j + ": ");
                score = sc.nextInt();
                totalScore += score;
            }

            avgScore = totalScore / 5;
            System.out.println("Group " + i + ": average score = " + avgScore);

            if (avgScore > bestAvg) {
                bestAvg = avgScore;
                bestGroup = i;
            }

            i++;
        }

        System.out.println("Highest average: Group " + bestGroup + " (" + bestAvg + ")");
    }
}