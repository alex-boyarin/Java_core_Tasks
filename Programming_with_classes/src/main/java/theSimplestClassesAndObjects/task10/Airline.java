package theSimplestClassesAndObjects.task10;

import java.io.PrintStream;
import java.util.Scanner;

// Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
public class Airline {
    private String destination;
    private int flightNumber;
    private String typeAirplane;
    private String departureTime;
    private String daysOfTheWeek;

    public Airline(String destination, int flightNumber, String daysOfTheWeek, String departureTime) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public void setTypeAirplane(String typeAirplane) {
        this.typeAirplane = typeAirplane;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public static Airline getAirline(Scanner scanner, PrintStream out) {
        out.print("Введите пункт назначения: ");
        String destination = scanner.next();
        out.print("Введите номер рейса: ");
        int flightNumber = scanner.nextInt();
        out.print("Введите день недели: ");
        String dayOfTheWeek = scanner.next();
        out.print("Введите время вылета: ");
        String departureTime = scanner.next();
        Airline airline = new Airline(destination, flightNumber, dayOfTheWeek, departureTime);
        out.print("Введите тип самолета: ");
        airline.setTypeAirplane(scanner.next());
        return airline;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination= " + destination +
                ", flightNumber= " + flightNumber +
                ", typeAirplane= " + typeAirplane +
                ", departureTime= " + departureTime +
                ", daysOfTheWeek= " + daysOfTheWeek +
                "}\n";
    }
}
