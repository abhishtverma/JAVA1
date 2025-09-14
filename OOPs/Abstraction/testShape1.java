package OOPs.Abstraction;

public class testShape1 {
    public static void main(String[] args) {
        circle1 circle = new circle1(5);
        System.out.println(circle.getRadius());
        System.out.println(circle.calculateArea());
        square1 square = new square1(7);
        System.out.println(square.getSide());
        System.out.println(square.calculateArea());
    }
}