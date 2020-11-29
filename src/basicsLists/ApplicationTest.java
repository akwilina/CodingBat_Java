package basicsLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

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
    @DisplayName("Should return max value when all values are negatives in sorted list")
    void shouldReturnMaxValueWhenAllValuesAreNegativesInSortedList() {
        //Given
        List<Integer> list = List.of(-1, -5, -3, -7, -4);

        //When
        int result = Application.maxValueOfSortedList(list);

        //Then
        Assertions.assertEquals(-1, result);
    }

    @Test
    @DisplayName("Should return zero when sorted list is empty")
    void shouldReturnZeroWhenSortedListIsEmpty() {

        //Given
        List<Integer> list = List.of();

        //When
        int result = Application.maxValueOfSortedList(list);

        //Then
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("Should return min value of sorted list when all values are negatives")
    void shouldReturnMinValueOfSortedListWhenAllValuesAreNegatives() {
        //Given
        List<Integer> list = List.of(-5, -3, -1, -11, -22);

        //When
        int result = Application.minValueOfSortedList(list);

        //Then
        Assertions.assertEquals(-22, result);
    }

    @Test
    @DisplayName("Should return highest occurrence of value from sorted list")
    void shouldReturnHighestOccurrenceOfValueFromSortedList(){

        //Given
        List<Integer> list = List.of(2, 2, 3, 4, 5, 5, 5, 6, 11);

        //When
        int result = Application.occurrenceCounter(list);

        //Then
        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("Should return sorted list from unsorted list")
    void shouldReturnSortedListFromUnsortedList() {
        //Given
        List<Integer> list = List.of(3, 2, 4, 1, 11, 1, 0, 2);

        //When
        List<Integer> result = Application.sortedList(list);

        //Then
        Assertions.assertEquals(List.of(0, 1, 1, 2, 2, 3, 4, 11), result);
    }

}