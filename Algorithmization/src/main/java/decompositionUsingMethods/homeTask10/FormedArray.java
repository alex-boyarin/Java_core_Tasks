package decompositionUsingMethods.homeTask10;

import java.util.Arrays;

public class FormedArray {
    int number;
    int[] array;

    public FormedArray(int number) {
        this.number = number;
        this.fillArray(getSizeOfArray());
    }

    private int  getSizeOfArray() {
        int arraySize=0;
        for (int i = number; i > 0; i /= 10) {
            arraySize++;
        }return arraySize;
    }

    private void fillArray(int arraySize) {
        array = new int[arraySize];
        int arrayIndex = array.length - 1;
        for (int j = number; j > 0; j /= 10) {
            array[arrayIndex] = j % 10;
            arrayIndex--;
        }
    }

    @Override
    public String toString() {
        return "Массив " + Arrays.toString(array);
    }
}



