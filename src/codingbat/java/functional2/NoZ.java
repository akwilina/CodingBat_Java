package codingbat.java.functional2;

import java.util.ArrayList;
import java.util.List;

/*
Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)

noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
 */

public class NoZ {

    public static void main(String[] args) {
        noZ(List.of("aaa", "bbb", "aza"));
        noZ(List.of("hziz", "hzello", "hi"));
        noZ(List.of("hello", "howz", "are", "youz"));
    }

    public static List<String> noZ(List<String> strings) {

        List <String> list = new ArrayList<>();

        for(String str : strings) {
            if(!str.contains("z")) {
                list.add(str);
            }
        }

        return list;
    }
}