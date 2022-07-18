package decompositionUsingMethods.homeTask5;

//  5. Составить программу, которая в массиве A[N] находит второе по величине число
//  (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
public class ArrayElement {
    public static void main(String[] args) {
        SortArray sortArray = new SortArray(10);
        System.out.println(sortArray);
        System.out.println("Второе по величине число = "+sortArray.getSecondLargestNumber());
    }
}
