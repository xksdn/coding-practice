/*
    6.25 전쟁 당시 임씨는 땅문서를 잃어버렸지만, 땅속 깊숙이 자신의 이름이 새겨진 옥구슬을 묻어둔 사실을 기억해냈다.
    옥구슬이 발견된 모든 지점을 포함하는 가장 작은 직사각형의 넓이를 구하는 프로그램을 작성하시오.
    직사각형의 변은 남북, 동서 방향과 평행해야 하며, 각 점의 좌표는 정수로 주어진다.
*/


package CodingTest.Geometry;

import java.util.Arrays;
import java.util.Scanner;

public class LandDocument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n < 0 || n >100000) {
            System.exit(0);
        }


        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            if (x[i] < -10000 || x[i] > 10000 || y[i] < -10000 || y[i] > 10000) {
                System.exit(0);
            }
        }

        if (n == 1) {
            System.out.println(0);
            System.exit(0);
        }

        int xMin = Arrays.stream(x).min().getAsInt();
        int xMax = Arrays.stream(x).max().getAsInt();
        int yMin = Arrays.stream(y).min().getAsInt();
        int yMax = Arrays.stream(y).max().getAsInt();

        System.out.println((xMax - xMin) * (yMax - yMin));
    }
}
