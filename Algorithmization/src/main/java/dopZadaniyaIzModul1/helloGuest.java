package dopZadaniyaIzModul1;
//1. Приветствовать любого пользователя при вводе его имени через командную строку.
import java.util.Scanner;

public class helloGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = scanner.next();
        System.out.print("Hello " + name);
    }
}
