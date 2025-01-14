package BruteForce;
/* 각 숫자는 건물의 높이를 뜻하고 건물과 건물 사이에 얼만큼의 빗물이 담길 수 있는지 구하시오.
*
* trappingRain은 건물 높이 정보를 보관하는 buildings를 파라미터로 받고, 담기는 빗물의 총량
*
* */
public class TrappingRain {
    public static void main(String[] args) {
        System.out.println(trappingRain(new int[]{3, 0, 0, 2, 0, 4}));
        System.out.println(trappingRain(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    public static int trappingRain (int[] buildings) {
        int count = 0;

        for (int i = 0; i < buildings.length; i++) {
            int leftBuildings = 0;
            int rightBuildings = 0;

            // 왼쪽 빌딩 측정
            for (int j = 0; j < i; j++) {
                leftBuildings = Math.max(leftBuildings, buildings[j]);
            }

            // 오른쪽 빌딩 측정
            for (int j = i; j < buildings.length; j++) {
                rightBuildings = Math.max(rightBuildings, buildings[j]);
            }

            int water = Math.min(leftBuildings, rightBuildings) - buildings[i];

            if (water > 0) {
                count += water;
            }

        }
        return count;
    }
}
