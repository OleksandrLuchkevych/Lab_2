package Lab2.Task2;

public class Pyramid extends VolumeFigure {
    private final Rectangle base;
    private final double height;

    public Pyramid(double firstSide, double secondSide, double height) {
        this.base = new Rectangle(firstSide, secondSide);
        this.height = height;
    }

    @Override
    public double volume() {
        return base.area() * height;
    }
}
