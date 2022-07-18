package decompositionUsingMethods.homeTask4;

public class Point {
    int x;
    int y;
    String name;

    public Point(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;

    }

    public double distance(Point otherPoint) {
        return Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
    }

    @Override
    public String toString() {
        return name+"("+x+", "+y+")";
    }
}
