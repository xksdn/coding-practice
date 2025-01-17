/*
가로, 세로 길이를 입력받고 해당 값을 기반으로 직사각형의 넓이를 구하시오.
*/

package CodingTest.Geometry;

import java.util.Scanner;

public class Oblong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        if (width < 1 || width > 100) {
            System.exit(0);
        }
        int length = sc.nextInt();
        if (length < 1 || length > 100) {
            System.exit(0);
        }


        System.out.println(width * length);

    }
}
