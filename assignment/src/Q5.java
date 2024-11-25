import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("nums = ");
        String nums = scanner.nextLine();

        String[] num = nums.split(",\\s*");
        for (String n : num) {
            list.add(Integer.parseInt(n));
        }


        if (list.size() < 2 || list.size() > 10000) {
            System.out.println("범위를 벗어났습니다.");
            System.exit(0);
        }

        System.out.print("target = ");
        int target = scanner.nextInt();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println(list.get(j) + "," +list.get(i));
                    System.exit(0);
                }
            }
        }
        System.out.println(0);
    }
}
