package courses.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysDsTest {

    @Test
    public void reverseArray() {
        //Given
        int[] a = new int[] {1, 4, 3, 2};
        int[] reversed = new int[] {2, 3, 4, 1};

        //When
        int[] reversedArray = ArraysDs.reverseArray(a);

        //Then
        assertArrayEquals(reversedArray, reversed);
    }
}