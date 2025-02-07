package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            numList.add(num);
        }

        int avg = numList.stream().mapToInt(Integer::intValue).sum() / 5;

        numList.sort(Integer::compareTo);
        int mid = numList.get(2);

        System.out.println(avg);
        System.out.println(mid);
    }
}
