package theSimplestClassesAndObjects.task4;

import java.util.Comparator;

public class DepartureTimeSort implements Comparator<Train> {
    @Override
    public int compare(Train time1, Train time2) {
        return time1.getDepartureTime().compareTo(time2.getDepartureTime());
    }
}
