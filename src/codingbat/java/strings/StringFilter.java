package codingbat.java.strings;

import java.util.Arrays;

public class StringFilter {

    public static void main(String[] args) {

        String[] stringArray = new String[] {"agattata", "loopapala", "ewa", "ana", "ola", "ewa", "ola", "pnamanaama", "mama", "nana", "roma", "asia", "sam", "tomekkkkjo"};
        System.out.println(Arrays.toString(notLongerThan(stringArray, 5)));
    }

    public static String[] notLongerThan(String[] stringArray, int size) {

        String[] stringSizeArray = new String[0];

        for (String str : stringArray) {

            if (str.length() <= size) {
                stringSizeArray = Arrays.copyOf(stringSizeArray, stringSizeArray.length + 1);
                stringSizeArray[stringSizeArray.length - 1] = str;

            }
        }
        return stringSizeArray;
    }
}