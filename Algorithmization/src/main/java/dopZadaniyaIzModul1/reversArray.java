package dopZadaniyaIzModul1;

import java.util.Arrays;
import java.util.Scanner;

//2.Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class reversArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number ");
        in.useDelimiter("(,)|\n");
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = in.nextInt();
        }System.out.print(Arrays.toString(array));

    }
}

