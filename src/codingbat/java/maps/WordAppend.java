package codingbat.java.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordAppend {

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new LinkedHashMap<>();
        String result = "";

        for(String str : strings){
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
                if(map.get(str) % 2 == 0){
                    result = result.concat(str);
                }
            } else {
                map.put(str, 1);
            }
        }

        return result;
    }
}