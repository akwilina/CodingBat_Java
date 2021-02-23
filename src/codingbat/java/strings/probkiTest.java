package codingbat.java.strings;

import org.junit.jupiter.api.Test;

import static codingbat.java.strings.probki.nieDluzsze;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class probkiTest {

   @Test
    public void shouldReturnNullWhenArrayIsNull() {

//given
        String[] array = new String[0];

//when
        String[] result = nieDluzsze(array, 2);

//then
        assertEquals(0, result.length);
    }


}
