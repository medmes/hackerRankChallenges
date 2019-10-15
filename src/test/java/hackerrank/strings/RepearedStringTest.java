package hackerrank.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepearedStringTest {

    @Test
    public void repeatedString_shouldReturnSeven() {

        //Given

        //When
        long countA = RepearedString.repeatedString("aba", 10);
        //Then
        assertEquals(7, countA);
    }

    @Test
    public void repeatedString() {

        //Given

        //When
        long countA = RepearedString.repeatedString("a", 1000000000000L);
        //Then
        assertEquals(1000000000000L, countA);
    }
}
