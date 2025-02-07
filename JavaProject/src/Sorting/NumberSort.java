package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numList = new ArrayList<>();

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            numList.add(num);
        }

        numList.sort(Integer::compareTo);

        for (int i : numList) {
            System.out.println(i);
        }
    }
}
