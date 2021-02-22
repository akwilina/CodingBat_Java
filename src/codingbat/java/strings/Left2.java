package codingbat.java.strings;

/*
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
 */

public class Left2 {

    public static void main(String[] args) {
        left2("Hello");
        left2("java");
        left2("Hi");
    }

    public static String left2 (String str) {
        String ending;

        if(str.length() >= 2) {
            ending = str.substring(0, 2);
            return str.substring(2).concat(ending);
        } else {
            return str;
        }
    }
}