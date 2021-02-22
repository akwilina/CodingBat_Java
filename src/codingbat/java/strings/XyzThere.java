package codingbat.java.strings;

/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
xyzThere("abc.xyzxyz") → true
 */

public class XyzThere {

    public static void main(String[] args) {

        xyzThere("abcxyz");
        xyzThere("abc.xyz");
        xyzThere("xyz.abc");
        xyzThere("abc.xyzxyz");
    }

    public static boolean xyzThere(String str) {

        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("(^xyz)|([^.]xyz)");
        java.util.regex.Matcher matcher = pattern.matcher(str);
        boolean matchFound = matcher.find();

        if (matchFound) {
            return true;
        } else {
            return false;
        }
    }
}