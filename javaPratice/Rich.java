// 백만 장자 프로젝트 코테

import java.util.*;

public class Rich {
    public static ArrayList<Integer> dateList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    // 매매가 입력
    public static void inputPrice(int Date) {
        for (int i = 0; i < Date; i++) {
            int salePrice = scanner.nextInt();
            if (salePrice <= 1000000) {
                dateList.add(salePrice);
            } else {
                System.out.println("알맞은 매매가가 아닙니다.");
            }
        }
    }

    // 매매와 판매
    public static long buyOrSell() {
        int size = dateList.size();
        int maxPrice = 0;
        long profit = 0;


        // 조건에 맞게 사고 팔기
        // 뒤에서 부터 차익을 계산
        for (int i = size - 1; i >= 0; i--) {
            if (dateList.get(i) > maxPrice) {
                maxPrice = dateList.get(i);
            }
            profit += maxPrice -dateList.get(i);
        }
        return profit;
    }

    public static void main(String[] args) {
        // 캐이스 수 입력
        int caseNum = scanner.nextInt();

        // 총 몇번의 케이스를 다룰지
        if (caseNum != 0){
            for (int i = 0; i < caseNum; i++) {
                // 일수 입력
                int Date = scanner.nextInt();
                inputPrice(Date);
                System.out.println("#" + (i + 1) + " " + buyOrSell());

                dateList.clear();
            }
        }
    }
}