import java.util.*;

public class stringBuilder15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[] { "A", "b", "h", "i", "s", "h", "t" };
        StringBuilder array = new StringBuilder();
        for (String string : arr) {
            array.append(string);
        }
        System.out.println(array);

    }
}
