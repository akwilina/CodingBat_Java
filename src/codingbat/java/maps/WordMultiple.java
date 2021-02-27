package codingbat.java.maps;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */

public class WordMultiple {

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Boolean> mapResult = new HashMap<>();

        for(String str : strings){
            if(map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        for(String key : map.keySet()){
            if(map.get(key) >= 2){
                mapResult.put(key, true);
            } else {
                mapResult.put(key, false);
            }
        }

        return mapResult;
    }
}