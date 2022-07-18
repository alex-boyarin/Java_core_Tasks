package decompositionUsingMethods.homeTask8;

import java.util.Arrays;

public class ArrayNumber {
    private int k;
    private int m;
    private int arraySize;
    private int[] array;

    public ArrayNumber(int k, int m, int arraySize) {
        this.k = k;
        this.m = m;
        this.arraySize = arraySize;
        fillTheArray();
    }

    @Override
    public String toString() {
        return "Массив случайных чисел. " + Arrays.toString(array);
    }

    private void fillTheArray() {
        array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber();
        }
    }

    private int randomNumber() {
        return (int) (Math.random() * 100);
    }

    public void sumElementArray() {
        for (int i = k; i < m; i += 2) {
            int count = 0;
            int sum = 0;
            for (int x = i; x <= m; x++) {
                if (count < 3) {
                    sum += array[x];
                    count++;
                } else {
                    break;
                }
            }
            if (count != 3) {
                sum += array[m - 2];
            }
            System.out.println(sum);
        }
    }
}