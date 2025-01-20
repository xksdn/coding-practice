/*
    문제 설명:
    - 길이가 a, b, c인 세 막대를 이용해 다음 조건을 만족하는 삼각형을 만들려고 한다.

    조건:
    1. 각 막대의 길이는 양의 정수여야 한다.
    2. 세 막대를 이용해 넓이가 양수인 삼각형을 만들 수 있어야 한다.
       (즉, 가장 긴 변의 길이는 나머지 두 변의 길이의 합보다 작아야 한다.)
    3. 삼각형의 둘레를 최대로 만들어야 한다.

    목표:
    - a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 삼각형의 둘레를 계산하여 출력한다.
*/


package CodingTest.Geometry;

import java.util.Arrays;
import java.util.Scanner;

public class MaxTrianglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자 3개 입력
        int[] length = new int[3];
        for (int i = 0; i < 3; i++) {
            length[i] = sc.nextInt();
        }

        // 배열을 정렬시켜 최대값이 마지막에 오도록함
        Arrays.sort(length);
        int a = length[0];
        int b = length[1];
        int c = length[2];

        if (c >= a + b) {
            c = a + b -1;
            System.out.println(a + b + c);
        } else {
            System.out.println(a + b + c);
        }

    }
}
