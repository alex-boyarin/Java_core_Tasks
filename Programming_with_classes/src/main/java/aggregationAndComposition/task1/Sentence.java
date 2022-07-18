package aggregationAndComposition.task1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sentence {
    private List<Word> words;

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public Sentence(List<Word> words) {
        this.words = words;
    }

    public static Sentence getSentence(Scanner scanner, PrintStream out) {

        List<Word> words = new ArrayList<>();
        while (true) {
            if (Word.isCheck() == false) {
                words.add(Word.getWord(scanner, out));
            } else {
                break;
            }
        }
        Word.setCheck(false);
        Sentence sentence = new Sentence(words);
        return sentence;
    }

    @Override
    public String toString() {
        return "" + words;
    }
}
