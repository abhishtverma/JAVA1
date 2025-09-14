import java.util.*;

public class break8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.println("Enter Inputs");
            String a = sc.nextLine();
            if (a == "exit") {
                break;
            }
        }
        System.out.println("Invalid input");
    }
}
