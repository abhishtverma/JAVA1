package OOPs.Inheritence;

public class testArrayOperation3 {
    public static void main(String[] args) {
        ArrayOperations3 opr = new ArrayOperations3(new int[] { 2, 4, 6, 9, 12 });
        ArrayOperations3.Statistics stat = opr.new Statistics();
        System.out.println(stat.mean());
    }
}
