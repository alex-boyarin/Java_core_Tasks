package theSimplestClassesAndObjects.task7;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double square() {
        double ab = Point.distance(a, b);
        double bc = Point.distance(b, c);
        double ac = Point.distance(a, c);
        double p = (ab + bc + ac) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }

    public double perimeter() {
        return Point.distance(a, b) + Point.distance(b, c) + Point.distance(a, c);
    }

    public Point medianCrossing() {
        return new Point((a.getX() + b.getX() + c.getX()) / 3, (a.getY() + b.getY() + c.getY()) / 3);
    }
}

