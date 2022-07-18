package workingWithRegExPatternMatcher.sortingText;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Text {
    String string;


    public Text(String string) {
        this.string = string;
        sortParagraphs();
    }

    public String[] sortParagraphs() {
        Pattern pattern = Pattern.compile("\n");
        String[] paragraphs = pattern.split(string);
        String temp;
        boolean sortDone;
        do {
            sortDone = false;
            for (int j = 0; j < paragraphs.length; j++) {
                int c = 0;
                pattern = Pattern.compile("(\\w+\\s*){1,}(\\.|\\?|\\!)*");
                Matcher matcher = pattern.matcher(paragraphs[j]);
                while (matcher.find()) {
                    c++;
                }
                for (int i = j + 1; i < paragraphs.length; i++) {
                    int d = 0;
                    matcher = pattern.matcher(paragraphs[i]);
                    while (matcher.find()) {
                        d++;
                    }
                    if (c > d) {
                        c = d;
                        temp = paragraphs[j];
                        paragraphs[j] = paragraphs[i];
                        paragraphs[i] = temp;
                        sortDone = true;
                    }
                }
            }
        } while (sortDone);
        return paragraphs;
    }

    public String sortWordsInSentences() {
        String result = "";
        Pattern pattern = Pattern.compile("\\.+");
        for (int i = 0; i < sortParagraphs().length; i++) {
            String[] sentences = pattern.split(sortParagraphs()[i]);
            for (int k = 0; k <= sentences.length - 1; k++) {
                result = result.concat(sortWords(sentences[k])).concat(".");
            }
        }
        return result.replaceAll("(\\.+){2,}", "\\.\n");
    }

    private String sortWords(String sentence) {
        Pattern pattern = Pattern.compile("(\\s)");
        String[] words = pattern.split(sentence);
        sortWords(words);
        String sortedSentence = Arrays.stream(words).collect(Collectors.joining(" "));
        return sortedSentence;
    }

    private void sortWords(String[] words) {
        String temp;
        boolean sortDone;
        do {
            sortDone = false;
            for (int j = 0; j < words.length; j++) {
                int c = 0;
                Pattern pattern = Pattern.compile("\\w");
                Matcher matcher = pattern.matcher(words[j]);
                while (matcher.find()) {
                    c++;
                }
                for (int q = j + 1; q < words.length; q++) {
                    int d = 0;
                    matcher = pattern.matcher(words[q]);
                    while (matcher.find()) {
                        d++;
                    }
                    if (c > d) {
                        c = d;
                        temp = words[j];
                        words[j] = words[q];
                        words[q] = temp;
                        sortDone = true;
                    }
                }
            }
        } while (sortDone);
    }
}
