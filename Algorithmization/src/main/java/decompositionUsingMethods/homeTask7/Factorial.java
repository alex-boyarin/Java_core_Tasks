package decompositionUsingMethods.homeTask7;

public class Factorial {
    private int number;
    private int sumFactorials;

    public Factorial(int number) {
        this.number = number;
    }

    public int oddFactorialSum() {
        int numberNew=number % 2 == 0?number-1:number;
        for (int i = numberNew; i > 0; i -= 2) {
            sumFactorials += factorial(i);
        }
        return sumFactorials;
    }

    public int factorial(int currentNumber) {
        int factorialOddNumber = 1;
        for (int j = 2; j <= currentNumber; j++) {
            factorialOddNumber *= j;
        }
        return factorialOddNumber;
    }
}


