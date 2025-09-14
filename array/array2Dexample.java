import java.util.Scanner;
import java.lang.Math;

public class array2Dexample {
	public static void main(String[] args) {

		int[][] array1 = input2Darray.getArray();

		sumavg(array1);
	}

	public static void sumavg(int[][] array1) {
		int p = array1.length;
		int q = array1[0].length;
		int b = 0;
		for (int m = 0; m < p; m++) {
			for (int n = 0; n < q; n++) {
				b = b +array1[m][n];
			}
		}
		System.out.println("Sum of 2D Array is: " + b);
		double c = (double) b / (p * q);
		System.out.println("Average of 2D Array is: " + c);

	}
}
