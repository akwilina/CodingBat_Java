package otherTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringFilter1 {

    public static void main(String[] args) {
        String[] stringArray = new String[] {"agattata", "loopapala", "ewa", "ana", "ola", "ewa", "ola", "pnamanaama", "mama", "nana", "roma", "asia", "sam", "tomekkkkjo"};
        System.out.println(Arrays.toString(noLongerThan1(stringArray, 5)));
        System.out.println(Arrays.toString(noLongerThan1(null, 5)));
    }

    public static String[] noLongerThan1 (String[] array, int n){

        String[] result = new String[0];

        if(n < 0){
            throw new IllegalArgumentException();
        }

        for (String str : array) {
            if (str.length() <= n) {
                result = Arrays.copyOf(result, result.length + 1);

                result[result.length - 1] = str;
            }
        }

        return result;
    }



}
