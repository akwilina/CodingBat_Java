package codingbat.java.warmup1;

public class SumDouble {
    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2)); // → 3
        System.out.println(sumDouble(3, 2)); // → 5
        System.out.println(sumDouble(2, 2)); // → 8
    }

    public static int sumDouble (int number1, int number2) {
        int sum = 0;
        if(number1 != number2) {
            sum = number1 + number2;
            return sum;
        } else {
            sum = 2 * (number1 + number2);
            return sum;
        }
    }
}