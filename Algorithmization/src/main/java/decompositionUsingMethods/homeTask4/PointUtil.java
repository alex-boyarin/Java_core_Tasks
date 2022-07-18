package decompositionUsingMethods.homeTask4;

public class PointUtil {

    public static PointPair farthestPoints(Point[] arrayPoints) {
        double distance = 0;
        Point resultPoint1 = new Point(0, 0, "");
        Point resultPoint2 = new Point(0, 0, "");
        for (int i = 0; i < arrayPoints.length; i++) {
            for (int j = i + 1; j < arrayPoints.length; j++) {
                if (arrayPoints[i].distance(arrayPoints[j]) > distance) {
                    distance = arrayPoints[i].distance(arrayPoints[j]);
                    resultPoint1 = arrayPoints[i];
                    resultPoint2 = arrayPoints[j];
                }
            }
        }return new PointPair(resultPoint1,resultPoint2);
    }
}
