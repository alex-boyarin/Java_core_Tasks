package decompositionUsingMethods.homeTsak17;

public class SubtractNumberToZero {
    private int number;

    public SubtractNumberToZero(int number) {
        this.number = number;
    }

    public int subtractingSumOfElements() {
        int counter = 0;
        while (number > 0) {
            counter++;
            number -= sumElements(number);
        }
        return counter;
    }

    private int sumElements(int number) {
        int sumElements = 0;
        for (int i = number; i > 0; i /= 10) {
            sumElements += i % 10;
        }
        return sumElements;
    }
}
