package workingWithStringArrayCharacters;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//  1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class WorkingWithString {
    public static void main(String[] args) {
        String[] string = {"camelCaseCase", "snakeCase"};
        Pattern pattern = Pattern.compile("\\B([A-Z])");
        for (int i = 0; i < string.length; i++) {
            Matcher matcher = pattern.matcher(string[i]);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(stringBuffer, "_$0");
            }
            matcher.appendTail(stringBuffer);
            string[i] = stringBuffer.toString().toLowerCase();
        }
        System.out.println(Arrays.toString(string));
    }
}
