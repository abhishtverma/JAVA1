package OOPs.Abstraction;

public class square1 extends Shape1 {
    private int side;

    public square1(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

}
