package codingbat.java.functional2;

import java.util.ArrayList;
import java.util.List;

/*
Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []
 */

public class NoTeen {

    public static void main(String[] args) {
        noTeen(List.of(12, 13, 19, 20));
        noTeen(List.of(1,14, 1));
        noTeen(List.of(15));
    }

    public static List<Integer> noTeen(List<Integer> nums) {

        List<Integer> list = new ArrayList<>();

        for(int number : nums) {
            if(number < 13 || number > 19) {
                list.add(number);
            }
        }

        return list;
    }
}