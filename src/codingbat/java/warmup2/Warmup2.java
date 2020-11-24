package codingbat.java.warmup2;

/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */

public class Warmup2 {

    public static void main(String[] args) {
        stringTimes("Hi", 2);
        stringTimes("Hi", 3);
        stringTimes("Hi", 1);
    }

    public static String stringTimes(String str, int n) {
        String result = "";

        for(int i = 0; i < n; i++) {
            result = result.concat((str));
        }

        return result;
    }
}