package CodingTest.CountEmoticon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class GomGomticon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        System.out.println("N을 입력하시오.");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String name = sc.nextLine();
            nameList.add(name);
        }

        list(nameList);
    }

    public static void list(ArrayList<String> nameList) {
        int count = nameList.stream()
                .distinct()
                .filter(x -> !x.contains(""))
    }
}
