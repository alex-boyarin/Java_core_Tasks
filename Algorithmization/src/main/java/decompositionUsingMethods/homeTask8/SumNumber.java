package decompositionUsingMethods.homeTask8;

//  8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//  Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива
//  с номерами от k до m.
public class SumNumber {
    public static void main(String[] args) {
        ArrayNumber arrayNumber = new ArrayNumber(2, 7, 10);
        System.out.println(arrayNumber);
        arrayNumber.sumElementArray();
    }
}
