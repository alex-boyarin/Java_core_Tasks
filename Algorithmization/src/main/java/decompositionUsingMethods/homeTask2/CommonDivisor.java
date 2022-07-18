package decompositionUsingMethods.homeTask2;

//  2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
public class CommonDivisor {
    public static void main(String[] args) {
        FindDivisor findDivisor = new FindDivisor(10, 48, 24, 50);
        System.out.println("Наибольший общий делитель = " + findDivisor.commonDivisor());
    }
}
