package BruteForce;

import java.util.Arrays;

/*
가까운 매장 찾기 문제

각 매장의 좌표를 입력받고 두 가게간의 거리를 계산,
매장별 거리가 가장 짧은 두 매장의 좌료를 return하는 함수
*/
public class MinDistance {
    public static void main(String[] args) {
        int[][] test = {
                {2, 3},
                {12, 30},
                {40, 50},
                {5, 1},
                {12, 10},
                {3, 4}
        };
        System.out.println(Arrays.deepToString(closestPair(test)));
    }

    public static int distance (int[] point1, int[] point2) {
        return (int) (Math.pow((point1[0] - point2[0]), 2) + Math.pow((point1[1] - point2[1]), 2));
    }

    public static int[][] closestPair (int[][] coordinates) {
        int temp = distance(coordinates[0], coordinates[1]);
        int point1 = 0;
        int point2 = 0;

        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp2 = distance(coordinates[i], coordinates[j]);

                if (temp > temp2) {
                    temp = temp2;
                    point1 = i;
                    point2 = j;
                }
            }
        }
        return new int[][] {coordinates[point2], coordinates[point1]};
    }
}
