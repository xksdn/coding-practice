import java.util.Scanner;
import java.util.jar.JarEntry;

public class testQuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
//        System.out.println(year(n = in.nextInt()));
//        System.out.println(score(n = in.nextInt()));
//        System.out.println(star(n = in.nextInt()));

    }
    public static String year(int x) {
        String str;
        if (x >= 19) {
            str = "성년";
        } else {
            str = "미성년";
        }
        return str;
    }

    public static String score(int x) {
        String str;
        if (x == 1){
            str = "아주 잘했습니다.";
        } else if (x <= 3) {
            str = "잘했습니다.";
        } else if (x <= 6) {
            str = "보통입니다.";
        } else {
            str = "노력해야겠습니다.";
        }
        return str;
    }

    public static String star(int x) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                str.append("*");
            }
            str.append("\n");
        }
        return str.toString();
    }

//    public static int triangle(int x, int y, int z) {
//        for (int i = 1; i <= 20; i++) {
//            for (int j = 1; j <= 20; j++) {
//                for (int k = 1; k <= 20; k++) {
//                    k*k = i*i + j*j;
//                }
//            }
//        }
//    }

}
