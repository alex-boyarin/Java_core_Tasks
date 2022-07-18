package decompositionUsingMethods.homeTask16;

import java.util.Arrays;

public class EvenOddArray {
    private int quantitySign;
    private int[] array;


    public EvenOddArray(int quantitySign) {
        this.quantitySign = quantitySign;
        fillingArray();
    }

    private void fillingArray() {
        array = new int[quantitySign];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber();
        }
    }

    private int randomNumber() {
        return (int) (Math.random() * (900 - 100) + 100);

    }

    @Override
    public String toString() {
        return "Массив случайных чисел " + Arrays.toString(array);
    }

    public int sumNumberWithOddDigits() {
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            if (isAllDigitsOdd(array[j]) == true) {
                sum = sum + array[j];
            }
        }
        return sum;
    }

    public int quantityEvenElements() {
        int counter = 0;
        for (int g = sumNumberWithOddDigits(); g > 0; g /= 10) {
            int evenElement = g % 10;
            if (evenElement % 2 == 0 && evenElement != 0) {
                counter++;
            }
        }
        return counter;
    }

    private boolean isAllDigitsOdd(int number) {
        int temp;
        for (int x = number; x > 0; x /= 10) {
            temp = x % 10;
            if (temp % 2 == 0) {
                return false;
            }
        }return true;
    }
}
