package decompositionUsingMethods.homeTask6;

//  6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
public class PrimeNumbers {
    public static void main(String[] args) {
        ComparisonPrimes comparisonPrimes = new ComparisonPrimes(81, 214, 11);
        comparisonPrimes.isMutuallySimple();
        if (comparisonPrimes.isMutuallySimple()) {
            System.out.println("Числа " + 81 + ", " + 214 + ", " + 11 + " являются взаимно простыми числами.");
        } else {
            System.out.println("Числа " + 81 + ", " + 214 + ", " + 11 + "не являются взаимно простыми числами.");
        }
    }
}