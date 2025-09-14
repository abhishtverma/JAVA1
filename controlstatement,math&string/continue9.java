import java.util.*;

public class continue9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of Elements to add:");
        int c = sc.nextInt();
        int b = 0;
        for (int i = 0; i < c; i++) {
            System.out.println("Enter Inputs");
            int a = sc.nextInt();
            if (a < 0) {
                continue;
            } else
                b+=a;
        }
        System.out.println("Sum is :" + b);
    }
}
