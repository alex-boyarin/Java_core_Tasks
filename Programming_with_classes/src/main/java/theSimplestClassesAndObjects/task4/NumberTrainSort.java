package theSimplestClassesAndObjects.task4;

import java.util.Comparator;

public class NumberTrainSort implements Comparator<Train> {
    @Override
    public int compare(Train number1, Train number2) {
        return number1.getNumberTrain() - number2.getNumberTrain();
    }
}
