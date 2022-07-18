package aggregationAndComposition.task2;

import java.io.PrintStream;
import java.util.Scanner;

public class Wheel {
    private String typeSeason;
    private String brand;
    private int diameter;

    public Wheel(String typeSeason, String brand, int diameter) {
        this.typeSeason = typeSeason;
        this.brand = brand;
        this.diameter = diameter;
    }

    public static Wheel getWheel(Scanner scanner, PrintStream out) {
        out.print("Введите сезон шины: ");
        String typeSeason = scanner.next();
        out.print("Введите марку шыны: ");
        String brand = scanner.next();
        out.print("Введите размер шины: ");
        int diameter = scanner.nextInt();
        Wheel wheel = new Wheel(typeSeason, brand, diameter);
        return wheel;
    }

    @Override
    public String toString() {
        return "typeSeason-'" + typeSeason + '\'' +
                ", brand-'" + brand + '\'' +
                ", diameter-" + diameter + '"' + '}' + "\n";
    }
}
