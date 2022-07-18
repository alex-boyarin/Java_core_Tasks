package decompositionUsingMethods.homeTask13;

import java.util.List;

// 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//  Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
//  Для решения задачи использовать декомпозицию.
public class TwinNumbers {
    public static void main(String[] args) {
        FindTwinNumbers findTwinNumbers = new FindTwinNumbers(25);
        List<String> twinsList = findTwinNumbers.twinsList();
        System.out.println("Простые числа близнецы:");
        for (String listTwins : twinsList) {
            System.out.println(listTwins);
        }
    }
}
