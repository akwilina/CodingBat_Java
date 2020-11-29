package basicsLists;

import java.util.Arrays;

public class SelectSortArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(selectionSort(new int[]{3, 2, 5, 6, 1})));
        int[] newArray = new int[]{};
        int[] secondArray;
        int[] thirdArray = new int[10];
        int[] fourthArray = {1, 2, 3, 5};

    }

    public static int[] selectionSort(int[] list) {
//unsorted array int[] {3, 2, 5, 6, 1}
//method: find minValue and put it at the begining of the list --> that part of the list is sorted now.
//method should produce sorted array: {1, 2, 3, 5, 6}

        int minValue;
        int indexOfMinValue;
        int tempValue = 0;

        for(int i = 0; i < list.length; i++) {
            minValue = list[i];
            indexOfMinValue = i;

            for(int j = i; j < list.length; j++) {
                if(minValue > list[j]){
                    minValue = list[j];
                    indexOfMinValue = j;
                }
            }

            if(minValue < list[i]) {
                tempValue = list[i];
                list[i] = list[indexOfMinValue];
                list[indexOfMinValue] = tempValue;
            }

        }

        return list;
    }
}