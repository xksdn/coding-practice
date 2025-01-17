/*
(x, y)에 위치해있고 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0)
오른쪽 위 꼭짓점은 (w, h)에 있다.

직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램.
*/


package CodingTest.Geometry;

import java.util.Scanner;

public class RectangleEscape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        if (w<0 || w>1001 || h<0 || h>1001) {
            System.exit(0);
        }
        if (x < 0 || x > w) {
            System.exit(0);
        }
        if (y < 0 || y > h) {
            System.exit(0);
        }

        int left = x;
        int bottom = y;
        int right = w - x;
        int top = h - y;

        int min = Math.min(Math.min(left, right) , Math.min(bottom, top));

        System.out.println(min);

    }
}
