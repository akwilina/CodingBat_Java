package codingbat.java.warmup1;

public class NotString {
    public static void main(String[] args) {
        System.out.println(notString("candy")); // "not candy"
        System.out.println(notString("x")); // "not x"
        System.out.println(notString("not bad")); // "not bad"
    }

    public static String notString(String text) {
        if(text.startsWith("not")) {
            return text;
        }
        return "not " + text;
    }
}