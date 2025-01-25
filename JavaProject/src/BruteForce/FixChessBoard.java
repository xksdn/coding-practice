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


        int count = 0;

        if (board[0][0] == 'W') {

        } else {

        }
    }
}
