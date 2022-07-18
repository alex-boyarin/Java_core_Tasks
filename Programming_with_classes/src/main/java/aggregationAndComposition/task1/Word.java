package aggregationAndComposition.task1;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Word {
    private String string;
    private static boolean check = false;


    public static boolean isCheck() {
        return check;
    }

    public static void setCheck(boolean check) {
        Word.check = check;
    }

    public Word(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public static Word getWord(Scanner scanner, PrintStream out) {
        String string = scanner.next();
        Pattern pattern = Pattern.compile("\\p{L}*\\.+");
        Matcher matcher = pattern.matcher(string);
        check = matcher.matches();
        Word word = new Word(string);
        return word;
    }

    @Override
    public String toString() {
        return string;
    }
}
