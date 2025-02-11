package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] data = new int[N];

        for (int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(br.readLine());
        }

        int max = Arrays.stream(data).max().getAsInt();

        // data 배열에서 최댓값을 최대 인덱스로 갖는 counts 배열 생성
        int[] counts = new int[max];

        // data에 각 인덱스에 해당하는 숫자가 몇번 등장하는지 누적 카운팅
        for (int number : data){
            int count = 0;
            for (int i = 0; i < max; i++) {
                if (data[i] == number) {
                    count++;
                }
            }
            counts[i] = count;
        }

        // counts 누적합으로 변경
        System.out.println(Arrays.toString(counts));

    }
}
