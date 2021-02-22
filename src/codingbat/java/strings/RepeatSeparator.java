package codingbat.java.strings;

/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */
public class RepeatSeparator {

    public static void main(String[] args) {
        repeatSeparator("Word", "X", 3);
        repeatSeparator("This", "And", 2);
        repeatSeparator("This", "And", 1);
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String result = "";

        if(count == 1) {
            result = word;
        } else if (count == 0){
            result = "";
        } else {
            for(int i = 0; i < count; i++){
                result = result + word.concat(sep);
            }
            int lastIndex = result.lastIndexOf(sep);
            result = result.substring(0, lastIndex);
        }
        return result;
    }
}