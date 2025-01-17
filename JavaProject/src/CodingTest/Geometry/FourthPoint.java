/*
세 점이 주어졌을 때, 축에 평행한 직사각형은 만들기 위해서 필요한 네 번째 점을 찾는 프로그램
*/

package CodingTest.Geometry;

import java.util.Scanner;

public class FourthPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];

        // (x, y) 형태로 입력받기
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        // XOR을 사용하여 네 번째 점 계산
        int fourthX = x[0] ^ x[1] ^ x[2];
        int fourthY = y[0] ^ y[1] ^ y[2];


        System.out.println(fourthX + " " + fourthY);
    }
}
