
package OOPs.Abstraction;

public class circle1 extends Shape1 {

    private int radius;

    public circle1(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
