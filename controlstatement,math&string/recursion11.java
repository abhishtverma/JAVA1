import java.util.*;

public class recursion11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Check the string is palindrome or not: ");
        String n = sc.nextLine();
        System.out.println(palindrome(n) ? "Palindrome" : "Not Palindrome");
    }

    public static boolean palindrome(String n) {
        int a = n.length();
        if (a <= 1) {
            return true;

        }
        if (n.charAt(0) != n.charAt(a - 1))

            return false;
        String str = n.substring(1, a - 1);
        return palindrome(str);
    }
}