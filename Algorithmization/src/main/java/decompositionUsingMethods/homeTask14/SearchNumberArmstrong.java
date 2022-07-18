package decompositionUsingMethods.homeTask14;

import java.util.ArrayList;
import java.util.List;

public class SearchNumberArmstrong {
    long number;

    public SearchNumberArmstrong(long number) {
        this.number = number;
    }

    public List<Long> methodArmstrong() {
        List<Long> armstrongNumbers = new ArrayList<Long>();
        for (long countElementNumber = 1; countElementNumber < number; countElementNumber++) {
            if (isArmstrongNumber(countElementNumber)) {
                armstrongNumbers.add(countElementNumber);
            }
        }
        return armstrongNumbers;
    }

    private boolean isArmstrongNumber(long countElementNumber) {
        if (countElementNumber < 10) {
            return true;
        } else {
            int powNumber = 0;
            for (long i = countElementNumber; i > 0; i /= 10) {
                powNumber++;
            }
            int sumElement = 0;
            long numericElement;
            for (long j = countElementNumber; j > 0; j /= 10) {
                numericElement = j % 10;
                sumElement += Math.pow(numericElement, powNumber);
            }
            if (countElementNumber == sumElement) {
                return true;
            }
        }
        return false;
    }
}
