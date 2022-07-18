package decompositionUsingMethods.homeTask15;

import java.util.List;

//  15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
//  (например, 1234, 5789). Для решения задачи использовать декомпозицию.
public class NaturalNumber {
    public static void main(String[] args) {
        SequenceOfNumericElements sequenceOfNumericElements = new SequenceOfNumericElements(10, 200);
        List<Integer> numberSequentialElements = sequenceOfNumericElements.listOfSequentialElements();
        System.out.println("Список чисел элементы которых образуют возрастающую последовательность:");
        for (int listNumber : numberSequentialElements) {
            System.out.println(listNumber);
        }
    }
}
