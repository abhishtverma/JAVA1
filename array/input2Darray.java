import java.util.Scanner;

public class input2Darray {
    public static int[][] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows in an array: ");
        int i = sc.nextInt();
        System.out.print("Column in an array: ");
        int j = sc.nextInt();
        int arr[][] = new int[i][j];
        int n = 0;
        while (n < i) {
            int m=0;
            while (m < j) {
                System.out.print("Enter ("+ n +","+ m +") array elements: ");
                arr[n][m] = sc.nextInt();
                m++;
            }
           n++;
        } 
        return arr;
    } 
}
