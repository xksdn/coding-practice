/**
 * 종말의 수: 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수 (예: 666, 1666, 2666, ...).
 * N번째로 작은 종말의 수를 찾는 프로그램.
 *
 * 입력: 자연수 N (1 ≤ N ≤ 10,000)
 * 출력: N번째 종말의 수
 *
 * 예시:
 * - 입력: 2
 * - 출력: 1666
 *
 * 설명:
 * - 첫 번째 종말의 수는 666, 두 번째는 1666, 세 번째는 2666, ...
 * - 숫자를 666부터 시작해 하나씩 증가시키며 "666"이 포함된 수를 찾고, N번째 수를 출력.
 */

package BruteForce;

import java.util.Scanner;

public class ApocalypticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N < 0 || N > 10000) {
            System.out.println("10,000봐다 작거나 같은 자연수를 입력해주세요.");
            System.exit(0);
        }


        int count = 0;
        int number = 666;

        while (true) {
            if (String.valueOf(number).contains("666")) {
                count++;
            }

            if (count == N) {
                System.out.println(number);
                break;
            }
            number++;
        }
    }
}
