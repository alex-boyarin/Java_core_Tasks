package theSimplestClassesAndObjects.task4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class InfoCenter {
    private int selection;
    private int number = 0;
    Scanner scanner = new Scanner(System.in);

    public InfoCenter(int selection) {
        this.selection = selection;
    }

    Comparator numberTrain = new NumberTrainSort();
    Comparator departureSort = new DepartureTimeSort();
    Comparator destinationSort = new DestinationSort();

    public int getNumber() {
        return number;
    }

    public Object sortingTrainCollection(List<Train> trains) {
        switch (selection) {
            case 1:
                Collections.sort(trains, numberTrain);
                break;
            case 2:
                Collections.sort(trains, departureSort);
                break;
            case 3:
                Collections.sort(trains, destinationSort);
                break;
        }
        return trains;
    }
}
