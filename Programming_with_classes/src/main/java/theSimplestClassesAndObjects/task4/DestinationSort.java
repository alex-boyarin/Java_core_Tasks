package theSimplestClassesAndObjects.task4;

import java.util.Comparator;

public class DestinationSort implements Comparator<Train> {
    @Override
    public int compare(Train destination1, Train destination2) {
        return destination1.getDestination().equals(destination2.getDestination()) ?
                destination1.getDepartureTime().compareTo(destination2.getDepartureTime()) :
                destination1.getDestination().compareTo(destination2.getDestination());
    }
}
