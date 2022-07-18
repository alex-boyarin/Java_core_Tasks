package decompositionUsingMethods.homeTask11;

public class ComparingStringsOfNumbers {
    long number1;
    long number2;

    public ComparingStringsOfNumbers(long number1, long number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public String numberLengthComparison() {
        if (String.valueOf(number1).length() > String.valueOf(number2).length()) {
            return "Число " + number1 + " Больше чем число " + number2;
        }
        return "Число " + number2 + " Больше чем число " + number1;
    }
}
