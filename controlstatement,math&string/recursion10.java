import java.util.*;

public class recursion10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci series upto: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int j = 0; j <= n; j++) {
            if (fibonacci(j) > n) {
                break;
            }
            System.out.println(fibonacci(j) + " ");
        }
        // for (int i = 0; i <= n; i++) {
        // if (a > n) --> This is a normal code
        // break; to print fibonacci series.
        // System.out.println(a);
        // int c = a + b;
        // a = b;
        // b = c;

    }

    public static int fibonacci(int j) {
        if (j == 0)
            return 0;
        if (j == 1)
            return 1;
        return fibonacci(j - 1) + fibonacci(j - 2);
    }
}
