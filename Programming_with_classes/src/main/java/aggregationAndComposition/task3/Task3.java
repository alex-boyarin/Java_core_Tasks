package aggregationAndComposition.task3;

import java.util.Arrays;
import java.util.Scanner;

//3. Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country country = ConsoleUtil.getCountry(scanner, System.out);
        System.out.println("столица-" + country.getCapital());
        System.out.println("площадь км2-" + country.getAreaCountry());
        System.out.println("Областные центры.\n" + Arrays.toString(country.getStates()));
        System.out.println("количество областей-" + country.getStates().length);
    }
}
