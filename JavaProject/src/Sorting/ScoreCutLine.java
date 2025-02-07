package Sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ScoreCutLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> scoreList = new ArrayList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();
            scoreList.add(score);
        }

        scoreList.sort(Comparator.reverseOrder());
        System.out.println(scoreList.get(K-1));

    }
}
