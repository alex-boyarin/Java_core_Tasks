package workingWithStringAndStringBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//   9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
//   Учитывать только английские буквы.
public class CountingLettersInString {
    public static void main(String[] args) {
        String string = "Count the number of Lowercase and Uppercase letters in the entered line." +
                "Count only English letters.";
        int uppercaseLetter = 0;
        int lowercaseLetter = 0;
        Pattern pattern = Pattern.compile("[A-Z]");
        Pattern pattern2 = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(string);
        Matcher matcher2 = pattern2.matcher(string);
        while (matcher.find()) {
            uppercaseLetter++;
        }
        while (matcher2.find()) {
            lowercaseLetter++;
        }
        System.out.println("Колличество прописных букв: " + uppercaseLetter);
        System.out.println("Колличество строчных букв: " + lowercaseLetter);
    }
}
