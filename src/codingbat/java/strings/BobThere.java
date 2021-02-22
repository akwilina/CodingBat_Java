package codingbat.java.strings;

public class BobThere {
/*
    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false
 */
    public static void main(String[] args) {

        bobThere("abcbob");
        bobThere("b9b");
        bobThere("bac");
    }

    public static boolean bobThere(String str) {

        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("b\\wb");
        java.util.regex.Matcher matcher = pattern.matcher(str);

        if(matcher.find()) {
            return true;
        } else {
            return false;
        }
    }
}