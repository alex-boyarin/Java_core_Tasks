package theSimplestClassesAndObjects.task1;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод,
// который находит наибольшее значение из этих двух переменных.
public class Test {
    public static void main(String[] args) {
        Variable variable = new Variable();
        variable.setVariableA(10);
        variable.setVariableB(4);
        System.out.println(variable.sumVariables());
        System.out.println(variable.displayOutput());
        System.out.println(variable.getVariableA() + " " + variable.getVariableB());
        System.out.println("Число наибольшей переменной= " + variable.greaterImportance());
    }
}
