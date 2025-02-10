package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ASCSort {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(sc.readLine());
        long[] list = new long[N];

        for (int i = 0; i < N; i++) {
            long num = Integer.parseInt(sc.readLine());
            list[i] = num;
        }

        Arrays.sort(list);
        for (long i : list) {
            System.out.println(i);
        }
    }
}
