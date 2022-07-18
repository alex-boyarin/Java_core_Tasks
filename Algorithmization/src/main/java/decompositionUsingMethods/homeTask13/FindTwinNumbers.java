package decompositionUsingMethods.homeTask13;

import java.util.ArrayList;
import java.util.List;

public class FindTwinNumbers {
    int startNumber;

    public FindTwinNumbers(int startNumber) {
        this.startNumber = startNumber;
    }

    public List<String> twinsList() {
        List<String> listTwins = new ArrayList<>();
        int endNumber = startNumber * 2;
        for (int i = startNumber; i <= endNumber - 2; i++) {
            if (isTwinPrimes(i,i+2)) {
                listTwins.add("(" + String.valueOf(i) + ", " + String.valueOf(i + 2) + ")");
            }
        }
        return listTwins;
    }

    private boolean isTwinPrimes(int a,int b) {
        for (int j = a - 1; j > 1; j--) {
            if (isDivider(a,j) || isDivider(b,j)) {
                return false;
            }
        }
        return true;
    }

    private boolean isDivider(int dividend, int divider) {
       return dividend % divider == 0;
    }
}