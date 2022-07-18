package workingWithStringAndStringBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//     5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class SearchLetterA {
    public static void main(String[] args) {
        int countLetterA = 0;
        String string = " Подсчитать, сколько раз среди символов заданной строки встречается буква \"А\"";
        Pattern pattern = Pattern.compile("[аА]");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            countLetterA++;
        }
        System.out.println("The number of letters \"а\" in the text= " + countLetterA);
    }
}
