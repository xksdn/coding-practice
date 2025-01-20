/*
    문제 설명:
    - N장의 카드 중에서 3장을 골라, 합이 M을 넘지 않으면서 M과 최대한 가까운 값을 찾아야 한다.
    - 조건:
      1. 각 카드는 양의 정수로 이루어져 있다.
      2. 카드 3장의 합이 M을 초과하면 안 된다.
      3. 카드 3장의 합 중 M에 가장 가까운 값을 출력한다.

    입력 예시:
    - 첫 줄: 카드 개수 N (3 ≤ N ≤ 100)과 목표 값 M (10 ≤ M ≤ 300,000)
    - 둘째 줄: N장의 카드에 적힌 숫자 (1 ≤ 카드 숫자 ≤ 100,000)

    출력:
    - 조건을 만족하는 최대 합
*/


package BruteForce;

import java.util.*;

public class Blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> cardList = new ArrayList<>();

        int N = sc.nextInt();
        int M = sc.nextInt();

        if (N < 3 || N > 100 || M < 10 || M > 300000) {
            System.exit(0);
        }

        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        // 배열안의 값을 더해가면서 한계를 넘지 않는 값만 새 리스트에 추가
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (cards[i] + cards[j] + cards[k] <= M) {
                        cardList.add(cards[i] + cards[j] + cards[k]);
                    }
                }
            }
        }

        // 리스트에서 최대값을 출력
        System.out.println(Collections.max(cardList));
//        System.out.println(cardList.stream().max(Integer::compareTo));
    }
}
