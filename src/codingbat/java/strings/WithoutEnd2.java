package codingbat.java.strings;

/*
Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 */

public class WithoutEnd2 {
    public static void main(String[] args) {
        withoutEnd2("Hello");
        withoutEnd2("abc");
        withoutEnd2("ab");
    }

    public static String withoutEnd2 (String str) {
        if(str.length() == 0 || str.length() == 1) {
            return "";
        } else {

            return str.substring(1, str.length() - 1);
        }
    }
}