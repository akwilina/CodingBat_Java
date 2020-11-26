package codingbat.java.functional1;

import java.util.ArrayList;
import java.util.List;

/*
Given a list of strings, return a list where each string has "*" added at its end.

addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]
 */

public class AddStar {

    public static void main(String[] args) {
        addStar(List.of("a", "bb", "ccc"));
        addStar(List.of("hello", "there"));
        addStar(List.of("*"));
    }

    public static List<String> addStar(List<String> strings) {

        List <String> strings2 = new ArrayList<>();

        for(String digit : strings) {
            digit = digit + "*";
            strings2.add(digit);
        }

        return strings2;
    }
}