package otherTasks;

import codingbat.java.strings.StringFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringFilterTest {

    @Test
    public void shouldThrowNullPointerExceptionWhenArrayIsNull(){
        //given
        String[] array = null;

        //when & then
        Assertions.assertThrows(NullPointerException.class, () -> StringFilter1.noLongerThan1(array, 1));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNumberIsNegative(){
        //given
        String[] array = new String[]{"anna", "ewa", "maka"};

        //when & then
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringFilter1.noLongerThan1(array, -5));
    }

    @Test
    public void shouldReturnArrayWithEnteredLengthWhenPositiveNumberAndNotEmptyArrayIsUsed(){
        //given
        String[] array = new String[]{"anna", "ewa", "maka", "olka", "wed", "pola"};
        int n = 3;
        //when
        String[] result = StringFilter1.noLongerThan1(array, n);
        //then
        Assertions.assertArrayEquals(new String[]{"ewa", "wed"}, result);
    }

}
