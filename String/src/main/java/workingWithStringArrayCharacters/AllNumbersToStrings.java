package workingWithStringArrayCharacters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//  4. В строке найти количество чисел.
public class AllNumbersToStrings {
    public static void main(String[] args) {
        String string = "В23строке21,12найти4 количество 65чисел.54";
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(string);
        int count2 = 0;
        while (matcher.find()) {
            count2++;
        }
        System.out.println("В строке string: " + count2 + " чисел.");
    }
}
