package arraysOfArrays;

//   11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
//   Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
public class SearchForRepetOfNum5 {
    public static void main(String[] args) {
        int[][] array = new int[10][20];
        int number = 15;
        int ourNumber = 5;
        int minQuantity = 3;
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[0].length; x++) {
                int mix = rnd(number);
                array[i][x] = mix;
                System.out.print(array[i][x] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int x = 0; x < array[0].length; x++) {
                if (array[i][x] == ourNumber) {
                    count++;
                    if (count >= minQuantity) {
                        System.out.println("String: " + i);
                        break;
                    }
                }
            }
        }
    }

    public static int rnd(int number) {
        return (int) (Math.random() * number);
    }
}
