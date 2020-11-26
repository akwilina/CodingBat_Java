package codingbat.java.functional1;

import java.util.ArrayList;
import java.util.List;

/*
Given a list of integers, return a list where each integer is multiplied with itself.

square([1, 2, 3]) → [1, 4, 9]
square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
square([]) → []
 */

public class Square {

    public static void main(String[] args) {
        square(List.of(1, 2, 3));
        square(List.of(6, 8, -6, -8, 1));
        square(List.of());
    }

    public static List<Integer> square(List<Integer> nums) {

        List<Integer> nums2 = new ArrayList<>();

        for(int number : nums) {
            number = number * number;
            nums2.add(number);
        }

        return nums2;
    }
}