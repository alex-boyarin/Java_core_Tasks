package workingWithStringAndStringBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//  1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class CountingConsecutiveSpaces {
    public static void main(String[] args) {
        String string = "1. Дан текст (строка). Найдите наибольшее количество     подряд идущих пробелов в нем.";
        int maxLengthSpace = 0;
        Pattern pattern = Pattern.compile("(\\s)\\1+");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            String group = matcher.group();
            if (group.length() > maxLengthSpace) {
                maxLengthSpace = group.length();
            }
        }
        System.out.println("Наибольшее колличество подряд идущих пробелов: " + maxLengthSpace);
    }
}
