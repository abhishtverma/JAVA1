import java.util.Scanner;

public class math14 {
    public void pi(int radius) {
        double area = Math.PI * radius * radius;
        double circumfrence = 2 * Math.PI * radius;
        System.out.printf("AREA IS %.2f and CIRCUMFRENCE IS %.2f%n", area, circumfrence);

    }

    public static int dice() {
        double k = Math.random() * 6;
        int m = (int) Math.ceil(k);
        return m;
    }

    public static boolean guess(int a) {
        double n = Math.random() * 10;
        int o = (int) Math.ceil(n);
        if (a == o) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st one
        math14 circle = new math14();
        circle.pi(6);

        // 2nd one
        System.out.println(dice());

        // 3rd one
        System.out.print("Enter a number b/w 1-10 for guessing: ");
        int a = sc.nextInt();
        if (guess(a)) {
            System.out.println("U guessed it right!");
        } else {
            System.out.println("Oops, you're wrong!");
        }

    }
}
