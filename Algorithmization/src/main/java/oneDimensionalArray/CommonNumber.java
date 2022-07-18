package oneDimensionalArray;

//   9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
//     Если таких чисел несколько, то определить наименьшее из них.
public class CommonNumber {
    public static void main(String[] args) {
        int[] array = {10, 10, 3, 6, 8, 3, 2, 2, 5, 5};
        int counter = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            int x = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    x++;
                    if (x > counter) {
                        counter = x;
                        number = array[j];
                    }
                    if (x == counter) {
                        if (array[i] < number) {
                            number = array[i];
                        }
                        if (array[i] > number) {
                        }
                    }
                }
            }
        }
        System.out.print(number);
    }
}



