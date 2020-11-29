package otherTasks;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {

    public static void main(String[] args) {
        fibonacciNumberOnIndex(4);
        fibonacciNumberOnIndex(5);
        fibonacciNumberOnIndex(10);

        fibonacciNumberOnPosition(4);
        fibonacciNumberOnPosition(5);
        fibonacciNumberOnPosition(10);

        printFirstXfibonacciElements(4);
        printFirstXfibonacciElements(5);
        printFirstXfibonacciElements(10);
    }

    private static int fibonacciNumberOnIndex(int index) {
        List<Integer> list = new ArrayList<>();

        list.add(0, 0);
        list.add(1, 1);

        for(int i = 2; i <= index; i++) {
            list.add(i, list.get(i - 1) + list.get(i - 2));
        }

        System.out.println("Number from fibonacci sequence: " + list.get(index) + " on index: " + index);
        return list.get(index);
    }


    public static int fibonacciNumberOnPosition(int position) {
        ///position of element in the array = index of this element - 1
        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);

        for(int i = 2; i <= position; i++){
            int nextNumber = fibonacciList.get(i-1) + fibonacciList.get(i-2);
            fibonacciList.add(nextNumber);
        }

        System.out.println("Number from fibonacci sequence: " + fibonacciList.get(position - 1) + " on position (not index): " + position);
        return fibonacciList.get(position - 1);
    }

    public static List<Integer> printFirstXfibonacciElements(int numberOfElements) {
        List<Integer> fibonacciList =  new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);

        for(int i = 2; i <= numberOfElements; i++) {
            int nextNumber = fibonacciList.get(i-1) + fibonacciList.get(i-2);
            fibonacciList.add(nextNumber);
        }

        System.out.println("First " + numberOfElements + " elements from Fibonacci sequence: " + fibonacciList);
        return fibonacciList;
    }
}