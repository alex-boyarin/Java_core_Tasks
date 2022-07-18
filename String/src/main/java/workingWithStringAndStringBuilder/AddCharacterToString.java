package workingWithStringAndStringBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//  2. В строке вставить после каждого символа 'a' символ 'b'.
public class AddCharacterToString {
    public static void main(String[] args) {
        String string = "When installing, insert after each (a) character (b).";
        Pattern pattern = Pattern.compile("(a)");
        Matcher matcher = pattern.matcher(string);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuilder, "$1b");
        }
        matcher.appendTail(stringBuilder);
        System.out.println(stringBuilder.toString());
    }
}
