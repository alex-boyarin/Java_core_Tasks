package workingWithStringAndStringBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//    10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
//    восклицательным или вопросительным знаком. Определить количество предложений в строке X.
public class CountSentencesInLine {
    public static void main(String[] args) {
        String string = "Line X contains several sentences!!! Each of which ends with a dot." +
                "Exclamation mark or question mark? Determine the number of sentences in line X!";
        int countSentences = 0;
        Pattern pattern = Pattern.compile("(\\w+\\s*){1,}(\\.|\\?|\\!)*");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println( matcher.group());
            countSentences++;
        }
        System.out.println("Колличество предложений в строке: " + countSentences);
    }
}
