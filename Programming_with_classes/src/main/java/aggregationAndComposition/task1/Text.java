package aggregationAndComposition.task1;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Text {
    private String heading;
    private List<Sentence> sentences;


    public Text(String heading, List<Sentence> sentences) {
        this.heading = heading;
        this.sentences = sentences;

    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public static Text getText(Scanner scanner, PrintStream out) {
        out.print("Введите заголовок- ");
        String heading = scanner.next();
        List<Sentence> sentence = new ArrayList<>();
        while (true) {
            out.print("Добавить техт. <y> <n> ? ");
            String choice = scanner.next();
            if (choice.equals("y")) {
                sentence.add(Sentence.getSentence(scanner, out));
            } else {
                break;
            }
        }
        Text text = new Text(heading, sentence);
        return text;
    }


    @Override
    public String toString() {
        return "Text heading-" + heading + "\n" + sentences.stream()
                .map(Sentence::getWords)
                .flatMap(Collection::stream)
                .map(Word::getString).collect(Collectors.joining(" "));
    }
}


