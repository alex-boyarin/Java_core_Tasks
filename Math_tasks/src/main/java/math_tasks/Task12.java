package math_tasks;

public class Task12 {               // Найти сумму квадратов первых ста чисел.
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2);
            System.out.println(sum);
        }
    }
}
