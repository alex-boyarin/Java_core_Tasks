package decompositionUsingMethods.homeTask16;


//     16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//     Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
public class SumNumber {
    public static void main(String[] args) {
        EvenOddArray evenOddArray = new EvenOddArray(15);
        System.out.println(evenOddArray);
        System.out.println("Сумма чисел = " + evenOddArray.sumNumberWithOddDigits() + "\n"
                + "Количество четных цифр = " + evenOddArray.quantityEvenElements());

    }
}

