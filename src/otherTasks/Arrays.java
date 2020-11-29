package otherTasks;

/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
 */
public class Arrays {

    public static void main(String[] args) {
        firstLast6(new int[]{1, 2, 6});
        firstLast6(new int[]{6, 1, 2, 3});
        firstLast6(new int[]{13, 6, 1, 2, 3});
        System.out.println(java.util.Arrays.toString(newArrayOf10()));

    }

    public static boolean firstLast6(int[] nums) {

            if (nums[0] == 6 || nums[nums.length - 1] == 6) {
                return true;
            } else {
                return false;
        }
    }

    public static int[] newArrayOf10() {
        int[] array = new int[10];

        for(int i = 0; i < 10; i++) {
            array[i] = i+1;
        }
        return array;
    }
}
