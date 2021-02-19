package codingbat.java.strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringFilterTest {

    @Test
    public void shouldReturnEmptyArrayOnEmptyArray() {
        // given
        String[] array = new String[0];

        // when
        String[] result = StringFilter.notLongerThan(array, 10);

        // then
        assertEquals(0, result.length, "For empty array argument should return empty array as result");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionOnNullArray() {
        // given
        String[] array = null;

        // when | then
        assertThrows(IllegalArgumentException.class, () -> StringFilter.notLongerThan(array, 0));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionOnNegativeSize() {
        // given
        String[] array = new String[0];
        int size = -1;

        // when | then
        assertThrows(IllegalArgumentException.class, () -> StringFilter.notLongerThan(array, size));
    }

    @Test
    public void shouldReturnArrayOfStringsWithLengthNotLongerThan5() {
        // given
        String[] array = {"", "a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi"};
        int size = 5;

        // when
        String[] result = StringFilter.notLongerThan(array, size);

        // then
        String[] expected = {"", "a", "ab", "abc", "abcd", "abcde"};

        assertArrayEquals(expected, result, String.format("Result should contains exactly %d elements: %s", expected.length, Arrays.toString(expected)));
    }

}