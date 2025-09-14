import java.util.*;

public class forloop6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Number for Multiplication:");
        // int a = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(a + "*" + i + "=" + a * i);
        // }
        System.out.print("Enter the number to check for prime:");
        int b = sc.nextInt();
        boolean c = true ;
        for (int j = 2; j < b; j++) {
            if (b % j == 0) {
                c=false;
            }
        }
        if (!c) {
            System.out.println("The number is not prime");
        } else
            System.out.println("This is prime number");

    }

}
