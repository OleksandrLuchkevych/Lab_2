package Lab2.Task2;

public class Square extends AreaFigures {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }
}
