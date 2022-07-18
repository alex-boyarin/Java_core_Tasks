package decompositionUsingMethods.homeTask4;

//  4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
//  между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Point a = new Point(-1, 1, "a");
        Point b = new Point(4, 3, "b");
        Point c = new Point(2, 7, "c");
        Point[] arrayPoints = {a, b, c};
        System.out.println(PointUtil.farthestPoints(arrayPoints));
    }
}
