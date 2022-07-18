package aggregationAndComposition.task2;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Car {
    private String carModel;
    private double fuelLevel;
    private double fuelConsumption;
    private Engine engine;
    private Wheel[] wheels;

    public Car() {
    }

    public Car(String carModel, double fuelLevel, double fuelConsumption, Engine engine, Wheel[] wheels) {
        this.carModel = carModel;
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String getCarModel() {
        return carModel;
    }

    public static Car getCar(Scanner scanner, PrintStream out) {
        out.print("Введите модель авто: ");
        String carModel = scanner.next();
        out.print("Введите обьем топлива: ");
        double fuelLevel = scanner.nextDouble();
        out.print("Введите расход топлива л/100 км: ");
        double fuelConsumption = scanner.nextDouble();
        Car car = new Car(carModel, fuelLevel, fuelConsumption,
                new Engine("", "", ""), new Wheel[4]);
        car.engine = Engine.getEngine(scanner, out);
        for (int i = 0; i < 4; i++) {
            car.wheels[i] = Wheel.getWheel(scanner, out);
        }
        return car;
    }

    public double calculateDistance() {
      double  distance = (fuelLevel / fuelConsumption) * 100;
        fuelLevel = 0;
        return distance;
    }

    public String travel() {
        return "Машина проехала " + calculateDistance() + " km/h." +
                " Топливо закончилось!";
    }

    public void fillTheCar(Scanner scanner) {
        fuelLevel += scanner.nextDouble();
    }

    public Wheel[] newWheels(Scanner scanner, PrintStream out) {
        for (int i = 0; i < 4; i++) {
            wheels[i] = Wheel.getWheel(scanner, out);
        }
        return wheels;
    }


    @Override
    public String toString() {
        return "Car model='" + carModel + '\'' + "\n" +
                "Engine=" + engine + "\n" +
                "Wheels\n" + Arrays.toString(wheels);
    }
}
