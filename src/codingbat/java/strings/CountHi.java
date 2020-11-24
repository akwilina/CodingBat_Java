package codingbat.java.strings;
/*
Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */
public class CountHi {

    public static void main(String[] args) {
        countHi("abc hi ho");
    }

    public static int countHi(String str) {
        int result = 0;
        str = str.replaceAll("[\\s]+", "");
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == 'h' && charArray[i + 1] == 'i') {
                result += 1;
            }
        }
        return result;
    }
}