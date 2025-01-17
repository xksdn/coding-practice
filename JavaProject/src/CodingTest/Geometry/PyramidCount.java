/*
한 변의 길이가 1인 정사각형은 피라미드 형식으로 아래로 붙여나간다.
가장 아랫부분의 정사각형이 n개가 되었을 때, 전체 둘레의 길이를 구하시오.
*/

package CodingTest.Geometry;

import java.util.Scanner;

public class PyramidCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        if (n < 0 || n > Math.pow(10, 9)) {
            System.exit(0);
        }

        System.out.println(4*n);
    }
}
