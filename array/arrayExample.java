import java.util.Scanner;
import java.lang.Math;

public class arrayExample {
	public static void main(String[] args) {
		int[] array1 = inputArray.getArray();
		int[] array2 = inputArray.getArray();

		merge(array1, array2);
	}

	public static void merge(int[] array1, int[] array2) {
		int newsize = array1.length + array2.length;
		int arraynew[] = new int[newsize];
		int i = 0, j = 0, k = 0, f;
		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j]) {
				arraynew[k] = array1[i];
				i++;
			}
			else {
				arraynew[k] = array2[j];
				j++;

			}
			k++;
		}
		while (i < array1.length) {
			arraynew[k] = array1[i];
			i++;
			k++;
		}
		while (j < array2.length) {
			arraynew[k] = array2[j];
			j++;
			k++;
		}
		for (f = 0; f < arraynew.length; f++) {
			System.out.print(arraynew[f]);
		}
	}
}
