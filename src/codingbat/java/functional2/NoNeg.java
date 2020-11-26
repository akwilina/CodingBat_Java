package codingbat.java.functional2;

import java.util.ArrayList;
import java.util.List;

/*
Given a list of integers, return a list of the integers, omitting any that are less than 0.

noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
 */
public class NoNeg {

    public static void main(String[] args) {

        noNeg(List.of(1, -2));
        noNeg(List.of(-3, -3, 3, 3));
        noNeg(List.of(-1, -1, -1));
    }

    public static List<Integer> noNeg(List<Integer> nums) {

        List <Integer> list = new ArrayList<>();

        for(int number : nums) {
            if(number >= 0) {
                list.add(number);
            }
        }

        return list;
    }
}