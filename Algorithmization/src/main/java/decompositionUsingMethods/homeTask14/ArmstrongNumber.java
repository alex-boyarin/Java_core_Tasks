package decompositionUsingMethods.homeTask14;

import java.util.List;

//  14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n,
//  равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
public class ArmstrongNumber {
    public static void main(String[] args) {
        SearchNumberArmstrong searchNumberArmstrong = new SearchNumberArmstrong(10_000_000L);
        List<Long> armstrongNumbers = searchNumberArmstrong.methodArmstrong();
        System.out.println("Числа являющиеся числом Армстронга:");
        for (long armstrongNumber : armstrongNumbers) {
            System.out.println(armstrongNumber);
        }
    }
}
