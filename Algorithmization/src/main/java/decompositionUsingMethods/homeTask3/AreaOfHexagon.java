package decompositionUsingMethods.homeTask3;

//  3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
public class AreaOfHexagon {
    public static void main(String[] args) {
        CalculateAreas calculateAreas = new CalculateAreas(10);
        System.out.println("Площадь шестиугодьника = " + calculateAreas.calculateAreaHexagon());
    }
}