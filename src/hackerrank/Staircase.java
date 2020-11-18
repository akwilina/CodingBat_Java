package hackerrank;

import java.util.*;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {

        String symbol = "#";
        String space = " ";

        for (int i = 1; i <= n; i++) {

            for (int j = n - i; j > 0; j--) {
                System.out.print(space);
            }

            for (int k = 0; k < i; k++) {
                System.out.print(symbol);
            }
            System.out.println("");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}