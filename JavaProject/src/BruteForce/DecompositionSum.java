/*
    문제 설명:
    - 자연수 N의 분해합은 N과 N의 각 자리수의 합으로 정의된다.
    - 어떤 자연수 M의 분해합이 N이라면, M을 N의 생성자라 한다.
    - 입력된 자연수 N에 대해 가장 작은 생성자를 구하는 프로그램을 작성한다.

    조건:
    1. 생성자는 없을 수도 있다. (출력은 0)
    2. 생성자가 여러 개인 경우, 가장 작은 생성자를 출력한다.

    예시:
    - 입력: 256
    - 과정: 245의 분해합은 245 + 2 + 4 + 5 = 256
    - 출력: 245
*/


package BruteForce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DecompositionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Long> list = new ArrayList<>();

        long N = sc.nextLong();

        for (long i = 0; i < N; i++) {
            int M = sumOfDigits(i);
            if (i + M == N) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(list));
        }
    }

    public static int sumOfDigits (long n) {
        int sum = 0;
        while (n > 0) {
            sum += (int) (n % 10);
            n /= 10;
        }
        return sum;
    }
}
