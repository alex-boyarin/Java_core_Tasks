package workingWithStringAndStringBuilder;

//  4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class BuildWord {
    public static void main(String[] args) {
        String string = "торт";
        String string2 = "информатика";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {
                if (string.charAt(i) == string2.charAt(j)) {
                    stringBuilder.insert(i, string2.charAt(j));
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
