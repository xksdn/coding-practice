/*
    문제 설명:
    - 세 변의 길이가 주어질 때 삼각형을 분류한다.
    - 조건:
      1. 세 변 모두 같음 → "Equilateral"
      2. 두 변만 같음 → "Isosceles"
      3. 세 변 모두 다름 → "Scalene"
      4. 삼각형 성립 불가 → "Invalid"
    - 가장 긴 변이 나머지 두 변의 합보다 크거나 같으면 "Invalid"
    - 0, 0, 0이 마지막에 들어오고 무시
*/


package CodingTest.Geometry;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int [][] length = new int[1000][3];

        while (true) {
            length[i][0] = sc.nextInt();
            length[i][1] = sc.nextInt();
            length[i][2] = sc.nextInt();

            if (length[i][0] == 0 && length[i][1] == 0 && length[i][2] == 0) {
                break;
            }
            i++;
        }

        for (int j = 0; j < i; j++) {
            int[] sides = {length[j][0], length[j][1], length[j][2]};

            Arrays.sort(sides);

            if (sides[2] >= sides[0] + sides[1]) {
                System.out.println("Invalid");
            } else if (sides[0] == sides[1] && sides[1] == sides[2]) {
                System.out.println("Equilateral");
            } else if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
