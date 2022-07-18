package decompositionUsingMethods.homeTask1;

public class NaturalIntegers {
    private int numberOne;
    private int numberTwo;
    private int divisor;

    public NaturalIntegers(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    private int smallestNumber() {
        return Math.min(numberOne, numberTwo);
    }

    private int greatestDivisor() {
        for (int i = smallestNumber(); i > 1; i--) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                divisor = i;
                break;
            }
        }
        return divisor;
    }

    private int smallerMultiple() {
        return (numberOne * numberTwo) / greatestDivisor();
    }

    @Override
    public String toString() {
        return "Наибольший общий делитель = " + greatestDivisor() + "\n"
                + "Наименьшее общее кратное = " + smallerMultiple();
    }
}
