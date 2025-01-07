package CodingTest.CountEmoticon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GomGomticon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        int num = sc.nextInt();
        sc.nextLine(); // 개행 제거

        for (int i = 0; i < num; i++) {
            String name = sc.nextLine();
            nameList.add(name);
        }

        System.out.println(list(nameList));
    }

    public static long list(ArrayList<String> nameList) {
        List<List<String>> partitions = new ArrayList<>();
        List<String> currentPartition = new ArrayList<>();

        for (String s : nameList) {
            if (s.equals("ENTER")) {
                if (!currentPartition.isEmpty()) {
                    partitions.add(new ArrayList<>(currentPartition));
                }
                currentPartition.clear();
            } else {
                currentPartition.add(s);
            }
        }

        // 마지막 파티션 추가
        if (!currentPartition.isEmpty()) {
            partitions.add(currentPartition);
        }

        // 고유한 사용자 수의 총합 계산
        return partitions.stream()
                .mapToLong(partition -> partition.stream().distinct().count())
                .sum();
    }
}
