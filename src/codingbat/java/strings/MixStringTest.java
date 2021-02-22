package codingbat.java.strings;


/*
mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
mixString("xxx", "X") → "xXxx"
mixString("2/", "27 around") → "22/7 around"
mixString("", "Hello") → "Hello"
mixString("Abc", "") → "Abc"
mixString("", "") → ""
mixString("a", "b") → "ab"
mixString("ax", "b") → "abx"
mixString("a", "bx") → "abx"
mixString("So", "Long") → "SLoong"
mixString("Long", "So") → "LSoong"
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MixStringTest {

    @Test
    public void shouldReturn_Axbycz_When_Abc_and_Xyz() {

        //given
        String str1 = "abc";
        String str2 = "xyz";
        //when
        String result = MixString.mixString("abc", "xyz");
        //then
        assertEquals("axbycz", result);
    }




}
