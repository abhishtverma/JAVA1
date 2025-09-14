import java.util.Scanner;
import java.lang.Math;

public class diagonal2D {
    public static void main(String[] args) {

        int[][] array1 = input2Darray.getArray();

        diagonal(array1);
    }

    public static void diagonal(int[][] array1) {
        int p = array1.length;
        int q = array1[0].length;
        int b = 0, c = 0;
        for (int m = 0; m < p; m++) {
            for (int n = 0; n < q; n++) {
                if (m == n) {
                    b = b + array1[m][n];
                }
            }
        }
        for (int m = 0; m < p; m++) {
            if (m != (q - m-1)) {
                c = c + array1[m][q - m -1];
            }
        }
        int d = b + c;
        System.out.println("Diagonal sum of array is: " + d);

    }
}
