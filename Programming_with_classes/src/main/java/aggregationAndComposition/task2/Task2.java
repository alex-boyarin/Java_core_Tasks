package aggregationAndComposition.task2;

import java.util.Scanner;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
public class Task2 {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ввыберите пункт меню:\n" +
                    " 1. добавить автомобиль.\n" +
                    " 2. марка атомобиля.\n" +
                    " 3. Ехать на авто.\n" +
                    " 4. заправлять авто.\n" +
                    " 5. менять колеса. " +
                    " 0. Выход.");
            String option = scanner.next();
            if (option.equals("1")) {
                car = Car.getCar(scanner, System.out);
            }
            if (option.equals("2")) {
                if (car.getCarModel() != null) {
                    System.out.println(car);
                } else {
                    System.out.println("Сначало заполните данные авто.");
                }
            }
            if (option.equals("3")) {
                System.out.println(car.travel());

            }
            if (option.equals("4")) {
                System.out.print("Введите кол-во топлива: ");
                car.fillTheCar(scanner);
            }
            if (option.equals("5")) {
                System.out.println("Введите новые шины.");
                car.newWheels(scanner, System.out);
            }
            if (option.equals("0")) {
                break;
            }
        }
    }
}
