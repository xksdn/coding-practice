/**
 * M×N 크기의 보드가 주어지고, 각 칸은 검은색('B') 또는 흰색('W')으로 칠해져 있다.
 * 이 보드에서 8×8 크기의 체스판을 잘라내려고 한다.
 * 체스판은 검은색과 흰색이 번갈아 칠해져 있어야 하며, 두 가지 패턴이 가능하다:
 * 1. 맨 왼쪽 위 칸이 흰색('W')인 경우
 * 2. 맨 왼쪽 위 칸이 검은색('B')인 경우
 *
 * 목표: 보드에서 8×8 크기의 부분 보드를 잘라내고, 체스판 패턴에 맞게 다시 칠해야 하는 칸의 최소 개수를 구하시오.
 */

package BruteForce;

import java.util.Scanner;

public class FixChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        // 왼쭉 위가 W인 경우
        char[][] patter1 = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    patter1[i][j] = 'W';
                } else {
                    patter1[i][j] = 'B';
                }
            }
        }
        // 왼쪽 위가 B인 경우
        char[][] patter2 = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    patter2[i][j] = 'B';
                } else {
                    patter2[i][j] = 'W';
                }
            }
        }

        int minCount = Integer.MAX_VALUE;

        for (int startRow = 0; startRow <= n - 8; startRow++) {
            for (int startCol = 0; startCol <= m - 8; startCol++) {
                int count1 = 0;
                int count2 = 0;

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (board[startRow + i][startCol + j] != patter1[i][j]) {
                            count1++;
                        }

                        if (board[startRow + i][startCol + j] != patter2[i][j]) {
                            count2++;
                        }
                    }
                }

                int currentMin = Math.min(count1, count2);

                if (currentMin < minCount) {
                    minCount = currentMin;
                }
            }
        }

        System.out.println(minCount);
    }
}
