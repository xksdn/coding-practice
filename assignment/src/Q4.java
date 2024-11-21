import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단어를 입력해주세요: (단. 1 <= s <= 100)");

        String words = scanner.nextLine();
        if (words.length() > 100 || words.length() < 1) {
            System.out.println("단어 입력범위를 벗어났습니다.");
            System.exit(0);
        }


        System.out.println(solution(words));
    }

    public static String solution(String words) {
        List<String> list = new ArrayList<>();
        String[] word = words.split("");

        list.addAll(Arrays.asList(word));

        int a = list.size() / 2;

        if (list.size() % 2 == 0) {
            return list.get(a-1) + list.get(a);
        }

        return list.get(a);
    }
}
