package otherTasks;

import java.util.Arrays;

public class FibonacciSequence {

    public static void main(String[] args) {

        int[] fibonacciArray = new int[15];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        for(int i = 0; i < 15 - 2; i++) {
            fibonacciArray[i + 2] = fibonacciArray[i + 1] + fibonacciArray[i];
        }

        System.out.println("Fibonacci sequence: " + Arrays.toString(fibonacciArray));
    }
}