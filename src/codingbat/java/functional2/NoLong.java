package codingbat.java.functional2;

/*
Given a list of strings, return a list of the strings, omitting any string length 4 or more.

noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []
 */

import java.util.ArrayList;
import java.util.List;

public class NoLong {

    public static void main(String[] args) {
        noLong(List.of("this", "not", "too", "long"));
        noLong(List.of("a", "bbb", "cccc"));
        noLong(List.of("cccc", "cccc", "cccc"));
    }

    public static List<String> noLong(List<String> strings) {

        List<String> list = new ArrayList<>();

        for(String str : strings) {
            if(str.length() < 4) {
                list.add(str);
            }
        }

        return list;
    }
}