package Lab2.Task2;

public class Cube extends VolumeFigure {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return side * side;
    }
}
