package workingWithStringAndStringBuilder;

import java.util.regex.Pattern;

//    8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
//     Случай, когда самых длинных слов может быть несколько, не обрабатывать.
public class SearchForLongestWord {
    public static void main(String[] args) {
        String string = " Find the longest word and it on the scrkeen .".strip();
        String word = "";
        Pattern pattern = Pattern.compile("\\s|\\p{Punct}");
        String[] strings = pattern.split(string);
        for (int i = 0; i < strings.length; i++) {
            if (word.length() == strings[i].length()) {
                word = "";
                System.out.println("Присутствует более одного самого длинного слова! Программа остановлена!");
                break;
            }
            if (word.length() < strings[i].length()) {
                word = strings[i];
            }
        }
        if (word.length() > 0) {
            System.out.println("Самое длинное слово: " + word + "\n" + "количество символов: " + word.length());
        }
    }
}
