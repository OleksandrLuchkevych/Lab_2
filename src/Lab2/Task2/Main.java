package Lab2.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<AreaFigures> areaFigures = new ArrayList<>();
        areaFigures.add(new Circle(5));
        areaFigures.add(new Rectangle(4, 2));
        areaFigures.add(new Square(4));
        areaFigures.add(new Triangle(3, 4, 5));

        for (AreaFigures a : areaFigures) {
            System.out.println("Area = " + a.area());
        }

        System.out.println(" ");

        List<VolumeFigure> volumeFigures = new ArrayList<>();
        volumeFigures.add(new Cube(3));
        volumeFigures.add(new Pyramid(3, 2, 5));
        volumeFigures.add(new Sphere(6));

        for (VolumeFigure v : volumeFigures) {
            System.out.println("Volume = " + v.volume());
        }
    }


}
