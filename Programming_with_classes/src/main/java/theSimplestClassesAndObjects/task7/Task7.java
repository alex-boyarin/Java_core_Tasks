package theSimplestClassesAndObjects.task7;

import java.util.Scanner;

//  7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
//  вычисления площади, периметра и точки пересечения медиан.
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение \'X\' и \'Y\' для точки \'a\'");
        Point a = new Point(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Введите значение \'X\' и \'Y\' для точки \'b\'");
        Point b = new Point(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Введите значение \'X\' и \'Y\' для точки \'c\'");
        Point c = new Point(scanner.nextDouble(), scanner.nextDouble());
        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Площадь треугольника= "+triangle.square());
        System.out.println("Периметр треугольника= "+triangle.perimeter());
        triangle.medianCrossing().toString();

    }
}
