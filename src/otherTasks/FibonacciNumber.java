package otherTasks;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {

    public static void main(String[] args) {
        fibonacci(4);
        fibonacci(5);
        fibonacci(10);
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
}