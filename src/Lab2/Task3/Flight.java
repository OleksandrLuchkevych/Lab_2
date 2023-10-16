package Lab2.Task3;

public class Flight {
    private String name;
    private Plane plane;

    public Flight(final String name, final Plane plane) {
        this.name = name;
        this.plane = plane;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
