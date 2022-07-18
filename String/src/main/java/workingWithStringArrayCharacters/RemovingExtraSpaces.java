package workingWithStringArrayCharacters;

//  5. Удалить в строке все лишние пробелы,
//  то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.
public class RemovingExtraSpaces {
    public static void main(String[] args) {
        String string = "    Удалить в     строке    все    лишние пробелы. Крайние    пробелы в   строке удалить.    ";
        string = string.replaceAll("\\s+", " ");
        System.out.println(string.strip());

    }
}
