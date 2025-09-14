package OOPs.Inheritence;

public class ArrayOperations3 {
    private int[] arr;

    public ArrayOperations3(int[] arr) {
        this.arr = arr;
    }

    public class Statistics {
        double mean() {
            double sum = 0;
            for (int i : arr) {
                sum += i;
            }
            return sum / arr.length;
        }

        double median() {
            // same as mean also find median
            return 0;
        }
    }
}
