package decompositionUsingMethods.homeTask5;

import java.util.Arrays;

public class SortArray {

    private int sizeArray;
    private int[] randomArray;

    public SortArray(int sizeArray) {
        this.sizeArray = sizeArray;
        fillTheArray();
    }

    private int randomNumber() {
        return (int) (Math.random() * 100);
    }

    private void fillTheArray() {
        randomArray = new int[sizeArray];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomNumber();
        }
    }

    @Override
    public String toString() {
        return "Массив случайных чисел = " + Arrays.toString(randomArray);
    }

    public int getSecondLargestNumber() {
        Arrays.sort(randomArray);
        for (int i = randomArray.length - 1; i > 0; i--) {
            if (randomArray[i] > randomArray[i - 1]) {
                return randomArray[i - 1];
            }
        }
        return -1;
    }
}




