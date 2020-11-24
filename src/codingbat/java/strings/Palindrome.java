package codingbat.java.strings;

public class Palindrome {

    public static void main(String[] args) {
        isPalindrome("otto");
        isPalindrome("toot");
        isPalindrome("toto");
        isPalindrome("mamamaaammmmama");
        isPalindrome("TaaT");
        isPalindrome("taAt");
        isPalindrome("ta at");
    }

    public static boolean isPalindrome (String str) {
        boolean result = true;

        for(int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        System.out.println(result);
        return result;
    }
}