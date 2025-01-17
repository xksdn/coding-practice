/*
    문제 설명:
    창영이는 삼각형의 종류를 외우기 위해 프로그램을 작성하려고 한다.
    세 각을 입력받아 다음과 같은 조건에 따라 삼각형의 종류를 판별한다.

    1. 세 각이 모두 60도일 경우 → "Equilateral" (정삼각형)
    2. 세 각의 합이 180도이고, 두 각이 같은 경우 → "Isosceles" (이등변삼각형)
    3. 세 각의 합이 180도이고, 모두 다른 경우 → "Scalene" (부등변삼각형)
    4. 세 각의 합이 180도가 아닌 경우 → "Error" (삼각형이 아님)
*/


package CodingTest.Geometry;

import java.util.Scanner;

public class MemorizeTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] degree = new int[3];

        for (int i = 0; i < 3; i++) {
            degree[i] = sc.nextInt();
        }

        int sum = degree[0] + degree[1] + degree[2];

        if (degree[0] == 60 && degree[1] == 60 && degree[2] == 60) {
            System.out.println("Equilateral");
        } else if (sum == 180) {
            if (degree[0] == degree[1] || degree[1] == degree[2] || degree[0] == degree[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
