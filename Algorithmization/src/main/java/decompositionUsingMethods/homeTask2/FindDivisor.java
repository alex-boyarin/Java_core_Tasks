package decompositionUsingMethods.homeTask2;

public class FindDivisor {
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int divisor;

    public FindDivisor(int number1, int number2, int number3, int number4) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
    }

    private int smallestNumber() {
        return Math.min(Math.min(number1, number2), Math.min(number3, number4));
    }

    public int commonDivisor() {
        for (int i = smallestNumber(); i > 1; i--) {
            if (number1 % i == 0 && number2 % i == 0 && number3 % i == 0 && number4 % i == 0) {
                divisor = i;
                break;
            }
        }
        return divisor;
    }
}
