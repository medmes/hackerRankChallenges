package hackerrank.wramup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class DeltaEncodingTest {

    @Test
    public void perform() {

        //Given
        int[] arr = new int[] {25626, 25757, 24367, 24267, 16, 100, 2, 7277};

        int[] resultExcepted = new int[] {25626, -128, 131, -128 ,-1390, -100, -128, -24251, 84, -98, -128 , 7275};
        //When

        int[] deltaEncoding = DeltaEncoding.perform(arr);

        //then
        assertArrayEquals(deltaEncoding,
                resultExcepted);
    }

    @Test
    public void perform_shouldNotPerformWhenArrayIsEmpty() {

        //Given
        int[] arr = new int[] {};

        //When

        int[] deltaEncoding = DeltaEncoding.perform(arr);

        //then
        assertArrayEquals(deltaEncoding,
                new int[]{});
    }
}
