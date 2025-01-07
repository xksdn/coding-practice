package CodingTest.HoneycombAlgorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Honeycomb {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        System.out.println(find_distance(number));


    }
    public static int find_distance(int number){
        if (number == 1) {
            return 1;
        }
        // 층 수
        int shell = 1;
        // 마지막 번호
        int lastNumber = 1;
        while (true) {
            // 다음 층의 마지막 방 번호 계산
            int nextNumber = lastNumber + 6 * shell;
            if (number <= nextNumber) {
                return shell + 1;
            }
            lastNumber = nextNumber;
            shell += 1;
        }
    }
}
