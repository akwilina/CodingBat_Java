package codingbat.java.strings;

import java.util.*;

public class probki {

    public static void main(String[] args) {
        List<String>list = List.of("ana", "ola", "ewa", "saba", "ola", "maja", "lara", "tomek", "michal", "ola", "ana", "tomek",
                "robert", "sam", "samanta", "sam", "lolek", "ania", "ewa", "lop");

        String[] array = {"ana", "ola", "ewa", "saba", "ola", "maja", "lara", "tomek", "michal", "ola", "ana", "tomek",
                "robert", "sam", "samanta", "sam", "lolek", "ania", "ewa", "lop"};

        List<String> result = powtarzajacaSie(list);
        System.out.println("Lista: " + result.toString());

        System.out.println("Array: " + Arrays.toString(nieDluzsze(array, 3)));

        System.out.println("powtarzajacasie1: " + powtarzajacaSie1(list).toString());

    }
    public static String[] nieDluzsze(String[] array, int n) {

        String[] result = new String[0];

        for(String str : array){

            if(str.length() <= n){
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = str;
            }
        }

        return result;
    }

    public static List<String> powtarzajacaSie(List<String> list){

        List<String> resultList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Integer counter = 0;

        for(String str : list){
            if(map.containsKey(str)){
                counter++;

            } else {
                counter = 1;
            }
            map.put(str, counter);
        }

        for(String strMap : map.keySet()){
            if(map.get(strMap) > 1){
                resultList.add(strMap);
            }
        }

        return resultList;
    }


    public static String[] nieDluzsze1(String[] array, int n){
        String[] resultArray = new String[0];

        for(String str : array){
            if(str.length() >= n){
                resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                resultArray[resultArray.length - 1] = str;
            }
        }

        return resultArray;
    }

    public static List<String> powtarzajacaSie1(List<String> list){

        Integer counter = 0;
        Map<String, Integer> map = new HashMap<>();

        for(String str : list){
            if(map.containsKey(str)){
                counter++;
            } else {
                counter = 1;
            }
            map.put(str, counter);
        }

        List<String> resultList = new ArrayList<>();

        for(String strMap : map.keySet()){
            if(map.get(strMap) > 1){
                resultList.add(strMap);
            }
        }
        return resultList;
    }

}
