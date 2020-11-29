package basicsLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    @DisplayName("should find max value from list")
    void shouldFindMaxValue() {
        // Given. Dane wejściowe
        List<Integer> integers = List.of(1, 2, 3, 4, 3, 2, 1);

        // when. Test warunku
        int result = Application.max(integers);

        // then. Założenia - to co ma być spełnione.
        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("should find max value when all values are negative")
    void shouldFindMaxValueWhenAllValuesAreNegative() {
        List<Integer> integers = List.of(-1, -2, -3, -4, -5);

        int result = Application.max(integers);

        Assertions.assertEquals(-1, result);
    }

    @Test
    @DisplayName("should return zero when list is empty")
    void shouldReturnZeroWhenListIsEmpty() {
        //given
        List<Integer> list = List.of();

        //when
        int result = Application.max(list);

        //then
        Assertions.assertEquals(0, result);
    }


    @Test
    @DisplayName("Should return max value when all values are negatives")
    public static void shouldReturnMaxValueWhenAllValuesAreNegatives() {
        //Given
        List<Integer> list = List.of(-1, -5, -3, -7, -4);

        //When
        int maxValue = Application.maxValueFromList(list);

        //Then
        Assertions.assertEquals(maxValue, -1);
    }


}