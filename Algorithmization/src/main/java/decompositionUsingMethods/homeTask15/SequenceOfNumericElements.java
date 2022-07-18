package decompositionUsingMethods.homeTask15;

import java.util.ArrayList;
import java.util.List;

public class SequenceOfNumericElements {
    private int startNumber;
    private int endNumber;

    public SequenceOfNumericElements(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public List<Integer> listOfSequentialElements() {
        List<Integer> numberSequentialElements = new ArrayList<>();
        for (int countNumber = startNumber; countNumber < endNumber; countNumber++) {
            if (isConsecutive(countNumber)) {
                numberSequentialElements.add(countNumber);
            }
        }
        return numberSequentialElements;
    }

    private boolean isConsecutive(int countNumber) {
        if (countNumber <= endNumber) {
            boolean check = false;
            int temp = endNumber;
            for (int j = countNumber; j > 0; j /= 10) {
                if (temp > j % 10) {
                    temp = j % 10;
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                return true;
            }
        }
        return false;
    }
}