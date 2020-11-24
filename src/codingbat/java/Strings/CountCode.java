package codingbat.java.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */

public class CountCode {
    public static void main(String[] args) {

        countCode("aaacodebbb");
        countCode("codexxcode");
        countCode("cozexxcope");
    }

    public static int countCode(String str) {
        int result = 0;

        Pattern compile = Pattern.compile("co\\we");
        Matcher matcher = compile.matcher(str);

        while (matcher.find()) {
            result++;
        }
        System.out.println(result);
        return result;
    }
}