package codingbat.java.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
bobThere("abcdefb") → false
bobThere("123abcbcdbabxyz") → true
bobThere("b12") → false
bobThere("b1b") → true
bobThere("b12b1b") → true
bobThere("bbc") → false
bobThere("bbb") → true
bobThere("bb") → false
bobThere("b") → false
 */
public class BobThereTest {

    @Test
    public void shouldReturnTrueWhenAbcbob() {
        //given
        String str = "abcbob";

        //when
        boolean result = BobThere.bobThere(str);

        //then
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnTrueWhenb9b () {
        //Given
        String str = "b9b";
        //When
        boolean result = BobThere.bobThere(str);
        //Then
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseWhenBac () {
        //given
        String str = "bac";
        //when
        boolean result = BobThere.bobThere(str);
        //then
        assertEquals(false, result);

    }

    @Test
    public void shouldReturnTrueWhenBbb () {
        //given
        String str = "bbb";
        //when
        boolean result = BobThere.bobThere(str);
        //then
        assertEquals(true, result);
    }

}
