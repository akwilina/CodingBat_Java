package codingbat.java.maps;

import java.util.HashMap;
import java.util.Map;

public class Topping1 {
    public static void main(String[] args) {

        Map<String, String> topping1 = new HashMap<>();
        topping1.put("ice cream", "peanuts");
        topping1.put("","");
        topping1.put("pancake", "syrup");

        topping1.put("bread", "butter");

        if(topping1.containsKey("ice cream")) {
            topping1.put("ice cream", "cherry");
        }
    }
}