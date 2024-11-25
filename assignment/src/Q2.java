import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Q2 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

//        while (true) {
//            System.out.println("숫자를 입력해주세요: (0을 누르면 중지)");
//            int number = scanner.nextInt();
//            if (number == 0) {
//                break;
//            }
//            list.add(number);
//        }
//        System.out.println(list);

//        System.out.println("숫자를 입력해주세요: ex) 1, 2, 3, 4");
        System.out.print("num_list = ");
        String number = scanner.nextLine();
        String[] nums = number.split(",\\s*");

        for (String num : nums) {
            list.add(Integer.parseInt(num));
        }

        System.out.println(solution(list));
    }

    public static int solution(List<Integer> list) {
        int addNum = IntStream.range(0, list.size())
                .filter(x -> x % 2 == 0)
                .map(x -> list.get(x))
                .sum();

        int EvenNum = IntStream.range(0, list.size())
                .filter(x -> x % 2 != 0)
                .map(x -> list.get(x))
                .sum();

        if (addNum < EvenNum) {
            return EvenNum;
        } else if (addNum > EvenNum) {
            return addNum;
        }

        return addNum;
    }
}
