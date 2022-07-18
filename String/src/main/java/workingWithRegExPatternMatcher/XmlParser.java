package workingWithRegExPatternMatcher;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//2. Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа
// и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
// Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
public class XmlParser {
    public static void main(String[] args) throws IOException {
        String word;
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\gygabayt\\IdeaProjects\\Git\\AlexB\\String\\Note.xml");
        int code;
        StringBuilder stringBuilder = new StringBuilder();
        while ((code = fileInputStream.read()) != -1) {
            stringBuilder.append((char) code);
        }
        String xml = stringBuilder.toString();
        Pattern patternOpen = Pattern.compile("(\\<+(\\w+)(\\s*\\w+\\s*=?\\s*\"+\\w+\"+\\s*)*\\/?\\>+)");
        Matcher matcherOpen = patternOpen.matcher(stringBuilder);
        while (matcherOpen.find()) {
            word = matcherOpen.group();
            if (word.contains("/>")) {
                System.out.println(word);
            } else {
                String closeWord = "</" + matcherOpen.group(2) + ">";
                int startIndex = matcherOpen.start();
                int endIndex = xml.indexOf(closeWord, startIndex) + closeWord.length();
                System.out.println(xml.substring(startIndex, endIndex));
            }
        }
    }
}
