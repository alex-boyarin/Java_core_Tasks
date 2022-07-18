package workingWithRegExPatternMatcher.sortingText;

import java.util.Arrays;

//1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом
// две различные операции: отсортировать абзацы по количеству предложений;
// в каждом предложении отсортировать слова по длине
public class SortingSentencesOfText {
    public static void main(String[] args) {
        Text text = new Text("December is the best of all. \n" +
                "Snowflakes dance. Snowflakes fall. \n" +
                "People see the New Year in. \n" +
                "When December ends. It will begin.");
        System.out.println(Arrays.toString(text.sortParagraphs()));
        System.out.println(text.sortWordsInSentences());
    }
}
