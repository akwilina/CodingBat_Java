package codingbat.java.functional1;

import java.util.ArrayList;
import java.util.List;

/*
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.

copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
 */

public class Copies3 {

    public static void main(String[] args) {

        copies3(List.of("a", "bb", "ccc"));
        copies3(List.of("24", "a", ""));
        copies3(List.of("hello", "there"));
    }

    public static List<String> copies3(List<String> strings) {

        List <String> list = new ArrayList<>();

        for(String word : strings) {
            word = word.concat(word).concat(word);
            list.add(word);
        }

        return list;
    }
}