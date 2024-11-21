import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("단어를 입력해주세요: ");
        String word = reader.readLine();

        System.out.println("길이: " + word.length());

    }
}
