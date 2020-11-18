package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        double positiveNumbers = 0.0;
        double zero = 0.0;
        double negativeNumbers = 0.0;

        for(int number : arr) {
            if(number > 0) {
                positiveNumbers += 1;
            } else if (number == 0) {
                zero += 1;
            } else {
                negativeNumbers += 1;
            }
        }

        int arrLength = arr.length;
        double positiveFraction = positiveNumbers / arrLength;
        double negativeFraction = negativeNumbers / arrLength;
        double zeroFraction = zero / arrLength;

        System.out.printf("%.6f %n", positiveFraction);
        System.out.printf("%.6f %n", negativeFraction);
        System.out.printf("%.6f %n", zeroFraction);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
