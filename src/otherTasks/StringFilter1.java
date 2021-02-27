package otherTasks;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class StringFilter1 {

    public static void main(String[] args) {
        String[] stringArray = new String[] {"agattata", "loopapala", "ewa", "ana", "ola", "ewa", "ola", "pnamanaama", "mama", "nana", "roma", "asia", "sam", "tomekkkkjo"};
        System.out.println(Arrays.toString(noLongerThan1(stringArray, 5)));
        //System.out.println(Arrays.toString(noLongerThan1(null, 5)));


        List<String> stringList = new ArrayList<String>();
        Collections.addAll(stringList, stringArray);

        System.out.println(repeating1(stringList));
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

    public static List<String> repeating1(List<String> list) {

        List<String> resultList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(String str : list){
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        for(String repStr : map.keySet()){
            if(map.get(repStr) > 1){
                resultList.add(repStr);
            }
        }

        return resultList;
    }



}
