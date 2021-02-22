package codingbat.java.strings;

/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */

public class MixString {

    public static void main(String[] args) {
        mixString("abc", "xyz");
        mixString("Hi", "There");
        mixString("xxxx", "There");
    }

    public static String mixString(String a, String b) {
        String result = "";
        int i;
        char charA;
        char charB;

        if(a.length() > b.length()){

            for(i = 0; i < b.length(); i++){

                charA = a.charAt(i);
                charB = b.charAt(i);
                result = result + charA + "" + charB;
            }

            return result.concat(a.substring(i));

        } else {

            for(i = 0; i < a.length(); i++){

                charA = a.charAt(i);
                charB = b.charAt(i);
                result = result + charA + "" + charB;
            }

            return result.concat(b.substring(i));
        }
    }
}