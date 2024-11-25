import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        List<String> id_list = new ArrayList<>();
        List<String> report = new ArrayList<>();

        // muzi, frodo, apeach, neo
        // muzi frodo, apeach frodo, frodo neo, muzi neo, apeach muzi

//        List<String> id_list = new ArrayList<>(Arrays.asList("muzi","frodo","apeach","neo"));
//        List<String> report = new ArrayList<>(Arrays.asList("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"));
//        int k = 2;
//
//        System.out.println(solution(id_list, report, k));


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
        String[] rep = reports.split(", ");

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
            // 소문자만 가능 (공백이 포함되면 소문자로 이루어있지 않다고 인식됨)
            String[] names = re.split(" ");
            if (!names[0].chars().allMatch(Character::isLowerCase)
                    || !names[1].chars().allMatch(Character::isLowerCase)) {
                System.out.println("report는 소문자여야 합니다.");
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


        System.out.println(solution(id_list, report, k));

    }

    public static List<Integer> solution(List<String> id_list, List<String> report, int k) {
        List<Integer> mail_result = new ArrayList<>();
        Map<String, Integer> mail_count = new HashMap<>();


        // 신고한 사람이 누구를 신고했는지 set을 사용해 중복 제거하여 map에 담기
        Map<String, Set<String>> report_names_map = new HashMap<>();
        for (String name : report) { // report 리스트를 map으로 변환
            String[] names = name.split(" ");
            String reporter = names[0];
            String reported = names[1];

            // 키가 이미 존재하는지 확인하고 저장
            // putIfAbsent: 키가 존재하지 않을 때만 값을 추가
            report_names_map.putIfAbsent(reporter, new HashSet<>());
            report_names_map.get(reporter).add(reported);
        }

        // 신고당한 사람이 몇번 신고 당했는지 카운트
        for (Set<String> i : report_names_map.values()) {
            for (String j : i) {
                mail_count.put(j, mail_count.getOrDefault(j, 0) + 1);
            }
        }

        // id에 맞는 mail보내야하는 양을 정함
        for (String id : id_list) {
            int count = 0; // 신고 횟수

            for (String name : report) {
                String[] names = name.split(" ");
                String reporter = names[0];
                String reported = names[1];

                // 신고한 아이디와 같고 신고받은 사람의 신고 횟수가 k 이상이면 카운트 증가
                if (reporter.equals(id) && mail_count.getOrDefault(reported, 0) >= k) {
                    count++;
                }
            }
            // 메일 추가
            mail_result.add(count);
        }

        return mail_result;
    }
}
