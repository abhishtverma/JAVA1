import java.util.*;

public class dowhile5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to number guessing game");
        int a = 7, b;

        do {
            System.out.print("Enter a number to play between 1 to 10:");
            b = sc.nextInt();

        } while (a != b);
        System.out.println("Correct Number");
    }
}
