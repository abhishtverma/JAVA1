import java.util.*;

public class switch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for add--Press 2 for subtract--Press 3 for multiplication--Press 4 for division:");
        int num1 = sc.nextInt();
        switch (num1) {
            case 1:
                System.out.println("Enter first no to add:");
                int a = sc.nextInt();
                System.out.println("Enter second no to add:");
                int b = sc.nextInt();
                System.out.println("Addition for both no: " + (a + b));
                break;
            case 2:
                System.out.println("Enter first no to subtract:");
                int c = sc.nextInt();
                System.out.println("Enter second no to subtract:");
                int d = sc.nextInt();
                System.out.println("Subtraction for both no: " + (c - d));
                break;
            case 3:
                System.out.println("Enter first no to multiply:");
                int e = sc.nextInt();
                System.out.println("Enter second no to multiply:");
                int f = sc.nextInt();
                System.out.println("Multiplication for both no: " + (e * f));
                break;
            case 4:
                System.out.println("Enter first no to divide:");
                int g = sc.nextInt();
                System.out.println("Enter second no to divide:");
                int h = sc.nextInt();
                System.out.println("Division for both no: " + (g / h));
                break;
            default:
                System.out.println("Invalid Input....");
                break;

        }

    }
}
