package decompositionUsingMethods.homeTask12;

import java.util.Arrays;

public class ArrayCreation {
    private int sumElement_K;
    private int sizeNumber_N;
    private int[] array;

    public ArrayCreation(int sumElement_K, int sizeNumber_N) {
        this.sumElement_K = sumElement_K;
        this.sizeNumber_N = sizeNumber_N;
        fillArray();
    }

    private int sizeArray() {
        int count = 0;
        for (int i = sizeNumber_N; i > 0; i--) {

            if (calculateDigitSum(i) == sumElement_K) {
                count++;
            }
        }
        return count;
    }

    private void fillArray() {
        int indexArray = sizeArray();
        array = new int[indexArray];
        for (int j = sizeNumber_N; j > 0; j--) {
            if (calculateDigitSum(j) == sumElement_K) {
                array[indexArray - 1] = j;
                indexArray--;
            }
        }
    }

    private int calculateDigitSum(int number) {
        int digitSum = 0;
        for (int j = number; j > 0; j /= 10) {
            digitSum += j % 10;
        }
        return digitSum;
    }

    @Override
    public String toString() {
        return "Массив элементов которыми являются числа, сумма цифр которых равна " + sumElement_K + " " + Arrays.toString(array);
    }
}
