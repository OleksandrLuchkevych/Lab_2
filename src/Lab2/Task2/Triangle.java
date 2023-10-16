package Lab2.Task2;

public class Triangle extends AreaFigures {
    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double area() {
        return 1 / 4. * Math.sqrt((firstSide + secondSide + thirdSide) * (secondSide + thirdSide - firstSide) *
                (firstSide + thirdSide - secondSide) * (firstSide + secondSide - thirdSide));
    }
}
