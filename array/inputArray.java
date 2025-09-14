import java.util.Scanner;
public class inputArray {
    public static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of an array: ");
        int i = sc.nextInt();

        int arr[] = new int[i];
        int n = 0;
        while (n < i) {
            System.out.print("Enter all array elements: ");
            arr[n] = sc.nextInt();
            n++;
        }
        return arr;
    }
}
