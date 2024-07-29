import java.util.Scanner;

public class Pactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("팩토리얼 값을 구할 정수 : ");
        int n = in.nextInt();
        System.out.println(factorial(n));

        System.out.println(factorial2(1, 5));
        System.out.println(factorial2(3,5));
        System.out.println(factorial2(10, 5));
    }

    static int factorial(int x) {
        int result = 1;

        while (x > 0) {
            result *= x;
            x--;
        }
        return result;
    }

    static int factorial2 (int x, int y) {
        int result = 1;
        for (int i = x; i <= y; i++) {
            result *= i;
        }

        return result;
    }
}


