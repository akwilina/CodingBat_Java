package otherTasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNumsAreNull (){
        //given
        int[] nums = null;

        //when + then
        Assertions.assertThrows(IllegalArgumentException.class, () -> Arrays.firstLast6(nums));
    }

}
