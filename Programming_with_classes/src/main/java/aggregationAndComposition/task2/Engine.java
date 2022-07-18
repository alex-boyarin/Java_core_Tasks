package aggregationAndComposition.task2;

import java.io.PrintStream;
import java.util.Scanner;

public class Engine {
    private String numberEngine;
    private String power;
    private String typeFuel;

    public Engine(String numberEngine, String power, String typeFuel) {
        this.numberEngine = numberEngine;
        this.power = power;
        this.typeFuel = typeFuel;
    }

    public static Engine getEngine(Scanner scanner, PrintStream out) {
        out.print("Введите номер двигателя: ");
        String numberEngine = scanner.next();
        out.print("Введите мощьность: ");
        String power = scanner.next();
        out.print("Введите тип топлива :");
        String typeFuel = scanner.next();
        Engine engine = new Engine(numberEngine, power, typeFuel);
        return engine;
    }

    @Override
    public String toString() {
        return "number-'" + numberEngine + '\'' + " power-'" + power + '\'' +
                " typeFuel-'" + typeFuel + '\'';
    }
}
