package decompositionUsingMethods.homeTask7;

//     7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class SummaFactorialOddNumber {
    public static void main(String[] args) {
        Factorial factorial = new Factorial(9);
        System.out.println("Сумма факториалов = " + factorial.oddFactorialSum());

    }
}
