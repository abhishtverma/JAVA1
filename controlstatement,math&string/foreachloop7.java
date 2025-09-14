import java.util.*;

public class foreachloop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int a = sc.nextInt();
        int array[] = new int[a];
        System.out.println("Enter the numbers to check the occurence: ");
        for (int d = 0; d < a; d++) {
            array[d] = sc.nextInt();
        }
        // int [] array=inputArray.getArray(); we have to declare package in both files
        // to run this bcz of different folders.
        for (int i : array) {
            int b = 0;
            for (int j : array)
                if (i == j) {
                    b++;
                }
            System.out.println("Occurence for " + i + " is " + b);
        }
    }
}