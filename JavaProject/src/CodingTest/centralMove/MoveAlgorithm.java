package CodingTest.centralMove;

import java.util.Scanner;

public class MoveAlgorithm {
    // 점의 증가률을 살펴보면 맨위면을 기준으로 2**2
    // 3**3, 5**5... 이 순서로 증가
    // 2, 3, 5, 9... = 2^n + 1 (n은 0부터)
    // Math의 pow를 사용해 거듭제곱으로 처리

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println((int)Math.pow(Math.pow(2, num)+1, 2));
    }
}
