package codingbat.java.functional1;

import java.util.ArrayList;
import java.util.List;

/*
Given a list of integers, return a list where each integer is multiplied by 2.

doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []
 */
public class Doubling {

    public static void main(String[] args) {

        doubling(List.of(1, 2, 3));
        doubling(List.of(6, 8, 6, 8, -1));
        doubling(List.of());
    }

    public static List<Integer> doubling(List<Integer> nums) {
        List<Integer> nums2 = new ArrayList<>();

        for(int number : nums) {
            number = number * 2;
            nums2.add(number);
        }

        return nums2;
    }
}