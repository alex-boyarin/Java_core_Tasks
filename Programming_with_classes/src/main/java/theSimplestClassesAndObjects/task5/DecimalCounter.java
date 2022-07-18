package theSimplestClassesAndObjects.task5;

public class DecimalCounter {
    private int number;
    private int bottomLine;
    private int upperLine;

    public DecimalCounter() {
        this.bottomLine = randomNumber();
        this.upperLine = randomNumber();
        replace();
        this.number = randomNumber(bottomLine, upperLine);

    }

    public DecimalCounter(int bottomLine, int upperBound, int number) {
        this.number = number;
        this.bottomLine = bottomLine;
        this.upperLine = upperBound;
    }

    private int randomNumber() {
        return (int) (Math.random() * 200 - 100);
    }

    private int randomNumber(int from, int to) {
        return (int) ((to - from) * Math.random() + from);

    }

    private void replace() {
        int temp;
        if (bottomLine > upperLine) {
            temp = bottomLine;
            bottomLine = upperLine;
            upperLine = temp;
        } else {
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBottomLine() {
        return bottomLine;
    }

    public void setBottomLine(int bottomLine) {
        this.bottomLine = bottomLine;
    }

    public int getUpperLine() {
        return upperLine;
    }

    public void setUpperLine(int upperLine) {
        this.upperLine = upperLine;
    }

    @Override
    public String toString() {
        return "Number: " + number + "\n" +
                "BottomLine: " + bottomLine + "\n" +
                "UpperBound: " + upperLine + "\n";
    }

    public void decrementCounter() {
        if (number > bottomLine) {
            number--;
        }
    }

    public void counterIncrease() {
        if (number < upperLine) {
            number++;
        }
    }
}

