package theSimplestClassesAndObjects.task2;


//  2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
//  Добавьте конструктор, инициализирующий члены класса по умолчанию.
//  Добавьте set- и get- методы для полей экземпляра класса.
public class Task2 {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        Constructor constructor1 = new Constructor(4, 5);
        constructor.setA(10);
        constructor.setB(15);
        System.out.println(constructor.getA() + "\n" + constructor.getB());
        System.out.println(constructor1.getA() + "\n" + constructor1.getB());
    }

}
