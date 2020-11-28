package basicsLists;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(1,2,3,-4,4,3,-1,2,7,8,99,-13,0,0,1,0,3,3,-8,-1,1,6));
        System.out.println(max(list));

    }


    public static int max(List <Integer> list) {
        int max = 0;

        for(Integer number : list) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }
}
