package oneDimensionalArray;

//  6. Задана последовательность N вещественных чисел.
//   Вычислить сумму чисел, порядковые номера которых являются простыми числами.
public class SumNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int divider;
        boolean isComplex;
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < array.length; i++) {
            isComplex = i == 0;
            for (divider = 2; divider < i; divider++) {
                if (i % divider == 0) {
                    isComplex = true;
                }
            }
            if (!isComplex) {
                sum += array[i];
                System.out.println(sum);
            }
        }
    }
}