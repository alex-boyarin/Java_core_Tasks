package workingWithStringAndStringBuilder;

//  6. Из заданной строки получить новую, повторив каждый символ дважды.
public class RepeatCharactersInString {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Повторить каждый символ дважды.");
        for (int j = stringBuilder.length() - 1; j >= 0; j--) {
            for (int i = 1; i <= 2; i++) {
                stringBuilder.insert(j, stringBuilder.charAt(j));
            }
        }
        System.out.println(stringBuilder);
    }
}
