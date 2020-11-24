package codingbat.java.strings;

public class CatDog {
/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */
    public static void main(String[] args) {
        catDog("catdog");
        catDog("catcat");
        catDog("1cat1cadodog");
        catDog("catxdogxdogxca");
    }

    public static boolean catDog(String str) {
        boolean result = false;
        int catOccur = 0;
        int dogOccur = 0;

        str = str.replaceAll("[//s]+", "");

        char[] charArray = str.toCharArray();

        for(int i = 0; i < charArray.length-2; i++) {
            if(charArray[i] == 'c' && charArray[i+1] == 'a' && charArray[i+2] == 't') {
                catOccur += 1;
            } else if (charArray[i] == 'd' && charArray[i+1] == 'o' && charArray[i+2] == 'g') {
                dogOccur += 1;
            }
        }

        if(catOccur == dogOccur) {
            result = true;
        }

        return result;
    }
}