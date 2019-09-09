package codingbat.java.warmup1;

public class MissingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1)); //"ktten"
        System.out.println(missingChar("kitten", 0)); // "itten"
        System.out.println(missingChar("kitten", 4)); // "kittn"
    }

    public static String missingChar (String text, int n){
        String start = text.substring(0, n);
        String end = text.substring(n+1, text.length());

        return start + end;
    }
}