package otherTasks;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(10));

        System.out.println(fibonacciNumber(4));
        System.out.println(fibonacciNumber(5));
        System.out.println(fibonacciNumber(10));
    }

    private static int fibonacci(int number) {
        List<Integer> list = new ArrayList<>();

        list.add(0, 0);
        list.add(1, 1);

        for(int i = 2; i <= number; i++) {
            list.add(i, list.get(i - 1) + list.get(i - 2));
        }

        return list.get(number);
    }


    public static int fibonacciNumber(int position) {
        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);

        for(int i = 2; i <= position; i++){
            int nextNumber = fibonacciList.get(i-1) + fibonacciList.get(i-2);
            fibonacciList.add(nextNumber);
        }

        return fibonacciList.get(position);
    }
}