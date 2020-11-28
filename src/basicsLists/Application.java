package basicsLists;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(1,2,3,-4,4,3,-1,2,7,8,99,-13,0,0,1,0,3,3,-8,-1,1,6));
        System.out.println(max(list));
        System.out.println(min(list));
        System.out.println(sum(list));
        System.out.println(average(list));
    }


    public static int max(List <Integer> list) {
        int max = Integer.MIN_VALUE;

        for(Integer number : list) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int min(List<Integer> list) {
        int min = Integer.MAX_VALUE;

        for(Integer number : list) {
            if(number < min) {
                min = number;
            }
        }
        return min;
    }


    public static int sum(List <Integer> list) {
        int sum = 0;

        for(Integer number : list) {
            sum = sum + number;
        }
        return sum;
    }

    public static int average (List <Integer> list) {
        int average;
        int sum = 0;

        for(Integer number : list) {

            sum = sum + number;
        }
        average = sum / list.size();

        return average;
    }
}
