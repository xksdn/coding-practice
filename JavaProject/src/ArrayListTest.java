import java.util.ArrayList;
import java.util.Objects;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add("apple");
        list.add(20);

        String name = (String)list.get(0);
        int count = (int) list.get(1);
        System.out.println(name + ", " + count);
    }
}
