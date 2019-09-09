package codingbat.java.warmup1;

public class MonkeyTrouble {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true)); //→ true
        System.out.println(monkeyTrouble(false, false)); //→ true
        System.out.println(monkeyTrouble(true, false)); // → false;
    }

    public static boolean monkeyTrouble (boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }
    }
}