package hackerrank.wramup;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;


public class OddNumbersTest {

    @Test
    public void odd_shouldReturnAllOddNumbersBetweenLandR() {
        //Given

        //When
        List<Integer> arr = OddNumbers.odd(2, 5);
        //Then
        assertThat(arr.size())
                .isEqualTo(2);
        assertThat(arr.get(0))
                .isEqualTo(3);
        assertThat(arr.get(1))
                .isEqualTo(5);
    }
}
