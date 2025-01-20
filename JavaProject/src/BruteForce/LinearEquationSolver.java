/*
    문제 설명:
    - 두 개의 연립방정식이 주어진다.
      ax + by = c
      dx + ey = f
    - 정수 a, b, c, d, e, f가 입력으로 주어진다 (-999 ≤ a, b, c, d, e, f ≤ 999).
    - 방정식을 만족하는 (x, y)의 값을 구하라.
    - (x, y)는 유일하게 존재하며, 항상 -999 ≤ x, y ≤ 999 범위 안에 있다.

    입력:
    - 정수 a, b, c, d, e, f (공백으로 구분됨)

    출력:
    - 문제의 답인 x와 y를 공백으로 구분하여 출력
*/


package BruteForce;

import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[6];

        for (int i = 0; i < 6; i++) {
            number[i] = sc.nextInt();
        }

        int a = number[0];
        int b = number[1];
        int c = number[2];
        int d = number[3];
        int e = number[4];
        int f = number[5];

        int x = 0;
        int y = 0;

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (a*i + b*j == c && d*i + e*j == f) {
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println(x + " " + y);
    }
}
