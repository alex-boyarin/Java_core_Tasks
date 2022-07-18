package workingWithStringAndStringBuilder;

//  7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
//  Например, если было введено "abc cde def", то должно быть выведено "abcdef".
public class RemovingDuplicateCharacters {
    public static void main(String[] args) {
        String string = "  abc Cde dEf Fgh Ghi  ".toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(string.replaceAll("\\s+", ""));
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
                    stringBuilder.deleteCharAt(j);
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
