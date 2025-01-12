package BruteForce;

/*
 왼쪽 카드뭉치에서 숫자 하나, 오른쪽 카드뭉치에서 숫자 하나를
 뽑아서 곱했을 때 그 값이 최대가 되는 값을 구하시오.
*/

public class MaxProduct {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{1, 6, 5}, new int[]{4, 2, 3}));
        System.out.println(maxProduct(new int[]{1, -9, 3, 4}, new int[]{2, 8, 3, 1}));
        System.out.println(maxProduct(new int[]{-1, -7, 3}, new int[]{-4, 3, 6}));

    }

    public static int maxProduct (int[] leftCards, int[] rightCards) {
        int temp = 0;

        for (int i : leftCards) {
            for (int j : rightCards) {
                if (i * j >= temp) {
                    temp = i * j;
                }
            }
        }
        return temp;
    }
}
