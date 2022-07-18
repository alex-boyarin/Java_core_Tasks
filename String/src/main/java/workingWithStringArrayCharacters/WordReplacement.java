package workingWithStringArrayCharacters;

//2.     Замените в строке все вхождения 'word' на 'letter'
public class WordReplacement {
    public static void main(String[] args) {
        String string = "word";
        System.out.println(string.replaceAll("word", "letter"));
    }
}
