package codingbat.java.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
repeatSeparator("Hi", "-n-", 2) → "Hi-n-Hi"
repeatSeparator("AAA", "", 1) → "AAA"
repeatSeparator("AAA", "", 0) → ""
repeatSeparator("A", "B", 5) → "ABABABABA"
repeatSeparator("abc", "XX", 3) → "abcXXabcXXabc"
repeatSeparator("abc", "XX", 2) → "abcXXabc"
repeatSeparator("abc", "XX", 1) → "abc"
repeatSeparator("XYZ", "a", 2) → "XYZaXYZ"
 */
public class repeatSeparatorTest {

    @Test
    public void shouldReturn_WordXWordXWord_when_Word_X_3() {
        //given
        String word = "Word";
        String sep = "X";
        int count = 3;
        //when
        String result = RepeatSeparator.repeatSeparator(word, sep, count);
        //then
        assertEquals("WordXWordXWord", result);
    }
}
