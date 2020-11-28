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
        // Given
        List<Integer> integers = List.of(1, 2, 3, 4, 3, 2, 1);

        // when
        int result = Application.max(integers);

        // then
        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("should find max value when all values are negative")
    void shouldFindMaxValueWhenAllValuesAreNegative() {
        List<Integer> integers = List.of(-1, -2, -3, -4, -5);

        int result = Application.max(integers);

        Assertions.assertEquals(-1, result);
    }



}