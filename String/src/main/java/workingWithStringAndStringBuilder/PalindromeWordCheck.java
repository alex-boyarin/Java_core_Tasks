package workingWithStringAndStringBuilder;

import java.util.Scanner;

//   3. Проверить, является ли заданное слово палиндромом.
public class PalindromeWordCheck {
    public static void main(String[] args) {
        boolean palindrome = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pleas word: ");
        String string = scanner.next().toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(string);
        StringBuilder stringBuilderRev = new StringBuilder(string).reverse();
        if (palindrome == stringBuilder.toString().contentEquals(stringBuilderRev)) {
            System.out.println("The word: \"" + string + "\" is a palindrome.");
        } else {
            System.out.println("The word: \"" + string + "\" don't palindrome.");
        }
    }
}
