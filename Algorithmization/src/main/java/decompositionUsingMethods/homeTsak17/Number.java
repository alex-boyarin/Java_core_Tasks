package decompositionUsingMethods.homeTsak17;

//  17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
//  Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
public class Number {
    public static void main(String[] args) {
        SubtractNumberToZero subtractNumberToZero = new SubtractNumberToZero(121);
        System.out.println("Количество операций уменшения " + subtractNumberToZero.subtractingSumOfElements());
    }
}
