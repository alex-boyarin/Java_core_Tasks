package oneDimensionalArray;

//      7. Даны действительные числа а1 ,а2 ,..., аn. Найти.max(a1+a2n, a2+a2n-1,...,an+an+1)
public class MaxSumElement {
    public static void main(String[] args) {
        int[] array = {8, 20, 42, 12, 100, 50, 40, 4, 15, 24};
        int maxSum = 0;
        for (int i = 0, x = array.length - 1; i < x; i++, x--) {
            if (array[i] + array[x] > maxSum) {
                maxSum = array[i] + array[x];
            }
        }
        System.out.println("largest sum of numbers " + maxSum);
    }
}
