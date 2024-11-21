import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        List<String> id_list = new ArrayList<>();
        List<String> report = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("id 리스트를 입력해주세요: ");
        // id_list 입력받음
        String id = scanner.nextLine();
        String[] i = id.split(",\\s*");

        // 1 <= id_list <= 1000
        if (i.length < 2 || i.length > 1000) {
            System.out.println("범위를 벗어났습니다.");
            System.exit(0);
        }
        // id_list안에 add
        for (String s : i) {
            // 1 <= id원소길이 <= 10
            if (s.length() < 1 || s.length() > 10) {
                System.out.println("범위를 벗어났습니다.");
                System.exit(0);
            }
            // 같은 아이디 중복 불가
            if (id_list.contains(s)) {
                System.out.println("중복되는 id입니다.");
                System.exit(0);
            }
            // 알파벳 소문자만 가능
            if (!s.chars().allMatch(Character::isLowerCase)) {
                System.out.println("id는 소문자여야 합니다.");
                System.exit(0);
            }

            id_list.add(s);
        }

        // report 입력
        System.out.println("신고 내역을 입력해주세요: ");
        String reports = scanner.nextLine();
        String[] rep = reports.split(",");

        // 1 <= report <= 200,000
        if (rep.length < 1 || rep.length > 200000) {
            System.out.println("범위를 벗어났습니다.");
            System.exit(0);
        }
        for (String re : rep) {
            // 3 <= report 원소 길이 <= 21
            if (re.length() < 3 || re.length() > 21) {
                System.out.println("범위를 벗어났습니다.");
                System.exit(0);
            }
            // 소문자만 가능
            if (!re.chars().allMatch(Character::isLowerCase)) {
                System.out.println("id는 소문자여야 합니다.");
                System.exit(0);
            }
            report.add(re);
        }

        // 신고 횟수 입력
        System.out.println("신고 횟수: ");
        int k = scanner.nextInt();
        // 1 <= k <= 200
        if (k < 1 || k > 200) {
            System.out.println("범위를 벗어났습니다.");
            System.exit(0);
        }

        solution(id_list, report, k);

    }

    public static void solution(List<String> id_list, List<String> report, int k) {


    }
}
