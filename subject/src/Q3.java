import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        System.out.println("문자를 입력해주세요: ");
        String words = scanner.nextLine();

        String[] word = words.split("");

        list.addAll(Arrays.asList(word));

        for (int i = 0; i < list.size(); i++ ) {
            String s = list.get(i);

            int distance = -1;

            for (int j = 0; j < i; j++ ) {
                if (s.equals(list.get(j))) {
                    distance = i - j;
                }
            }

            numList.add(distance);
        }

        System.out.println(numList);
    }
}
