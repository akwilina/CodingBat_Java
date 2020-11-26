package codingbat.java.functional2;

import java.util.ArrayList;
import java.util.List;

/*
Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]
 */

public class No9 {

    public static void main(String[] args) {

        no9(List.of(1, 2, 19));
        no9(List.of(9, 19, 29, 3));
        no9(List.of(1, 2, 3));
    }

    public static List<Integer> no9(List<Integer> nums) {

        List <Integer> list = new ArrayList<>();

        for(int number : nums) {
            if(number >= 0) {
                if( number % 10 != 9) {
                    list.add(number);
                }
            }
        }

        return list;
    }
}