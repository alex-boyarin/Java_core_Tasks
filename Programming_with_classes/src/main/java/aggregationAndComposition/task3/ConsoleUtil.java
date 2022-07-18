package aggregationAndComposition.task3;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleUtil {
    public static City getCity(Scanner scanner) {
        String name = scanner.next();
        City city = new City(name);
        return city;
    }

    public static Region getRegion(Scanner scanner, PrintStream out) {
        out.println("Введите название региона и город.");
        String nameRegion = scanner.next();
        City city = ConsoleUtil.getCity(scanner);
        Region region = new Region(nameRegion, city);
        return region;
    }

    public static State getState(Scanner scanner, PrintStream out) {
        out.println("Введите название области и областного города.");
        String nameState = scanner.next();
        City cityState = ConsoleUtil.getCity(scanner);
        out.print("Введите кол-во районов.");
        Region[] regions = new Region[scanner.nextInt()];
        for (int i = 0; i < regions.length; i++) {
            regions[i] = ConsoleUtil.getRegion(scanner, out);
        }
        State state = new State(nameState, cityState, regions);
        return state;
    }

    public static Country getCountry(Scanner scanner, PrintStream out) {
        out.print("Введите название государства: ");
        String nameCountry = scanner.next();
        out.print("Введите название столицы: ");
        City capital = ConsoleUtil.getCity(scanner);
        out.print("Введите площадь государства в км2: ");
        double areaCountry = scanner.nextDouble();
        State[] states = new State[scanner.nextInt()];
        for (int i = 0; i < states.length; i++) {
            states[i] = ConsoleUtil.getState(scanner, out);
        }
        Country country = new Country(nameCountry, capital, areaCountry, states);
        return country;
    }
}
