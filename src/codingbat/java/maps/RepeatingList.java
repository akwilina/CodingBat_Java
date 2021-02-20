package codingbat.java.maps;

import java.util.*;

public class RepeatingList {

    public static void main(String[] args) {
        String[] stringArray = new String[] {"agattata", "loopapala", "ewa", "ana", "ola", "ewa", "ola", "pnamanaama", "mama", "nana", "roma", "asia", "sam", "tomekkkkjo"};

        List<String> stringList = new ArrayList<String>();
        Collections.addAll(stringList, stringArray);

        repeatingList(stringList);
    }

    public static List<String> repeatingList (List<String> stringList) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String str : stringList) {

            if (map.containsKey(str)) {
                Integer integer = map.get(str);
                map.put(str, integer + 1);
            } else {
                map.put(str, 1);
            }
        }

        List<String> repeatingWords = new ArrayList<>();

        for (String word : map.keySet()) {
            Integer count = map.get(word);
            if (count >= 2) {
                repeatingWords.add(word);
            }
        }

        return repeatingWords;
    }

    public static List<String> repeatingList2(List<String> stringList) {
        Set<String> words = new HashSet<>();
        Set<String> repeatingWords = new HashSet<>();

        for (String str : stringList) {
            if (words.contains(str)) {
                repeatingWords.add(str);
            }
            else {
                words.add(str);
            }
        }

        return new ArrayList<>(repeatingWords);
    }
}
