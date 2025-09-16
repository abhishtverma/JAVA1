package OOPs.Polymorphism;

public class CalculatorTest1 extends Calculator1 {
    public static void main(String[] args) {
        Calculator1 a = new Calculator1();
        System.out.println(a.add(5, 6));
        System.out.println(a.add(5, 6, 7));
        System.out.println(a.add(5.5, 6.5));
    }
}
