package oneDimensionalArray;

//     5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class PrintNumbers {
    public static void main(String[] args) {
        int[] array = {0, 4, 5, 3, 2, 8, 6, 7, 10, 9};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
