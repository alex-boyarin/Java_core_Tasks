package decompositionUsingMethods.homeTask4;

public class PointPair {
    Point point1;
    Point point2;

    public PointPair(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Растояние между " + point1 + " и " + point2 + " равно "+point1.distance(point2);
    }
}
