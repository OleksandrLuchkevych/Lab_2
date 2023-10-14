package Lab2.Task2;

public class Rectangle extends AreaFigures{
    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }
    @Override
    public double area() {
        return firstSide*secondSide;
    }
}
