package aggregationAndComposition.task1;

import java.util.Scanner;

//1. Создать объект класса Текст, используя классы Предложение, Слово.
// Методы: дополнить текст, вывести на консоль текст, заголовок текста.
public class Tack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Text text = Text.getText(scanner, System.out);
        System.out.println(text);
    }

}


