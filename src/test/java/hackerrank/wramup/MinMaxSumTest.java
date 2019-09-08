package hackerrank.wramup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MinMaxSumTest {

    @Test
    public void miniMaxSum_shouldReturn() {

        // Given
        int[] arr = new int[] {1, 2, 3, 4, 5};

        //When
       String minSpaceMaxSum = MinMaxSum.miniMaxSum(arr);

       //Then
        assertEquals("10 14",
                minSpaceMaxSum);
    }
}