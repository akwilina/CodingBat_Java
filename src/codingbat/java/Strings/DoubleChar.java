package codingbat.java.Strings;

/*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */

public class DoubleChar {

    public static void main(String[] args) {
        doubleChar("The");
    }

    public static String doubleChar(String str) {
        String result = "";
        char[] wordArray = str.toCharArray();

        for(int i = 0; i < wordArray.length; i++){
            char character = wordArray[i];
            result = result + character + character;
        }

        return result;
    }
}