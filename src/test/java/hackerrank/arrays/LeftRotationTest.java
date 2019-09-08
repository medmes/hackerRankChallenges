package hackerrank.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;
@RunWith(JUnit4.class)
public class LeftRotationTest {

    @Test
    public void rotLeft_shouldReturnRotateArrayWith1() {

        //Given
        int[] a = new int[] {1, 2, 3, 4, 5};
        int[] rotatedArrayByOne = new int[] {2, 3, 4, 5, 1};

        //When
        int[] rotatedArray = LeftRotation.rotLeft(a, 1);

        //Then
        assertThat((Arrays.equals(rotatedArray, rotatedArrayByOne)))
                .isTrue();
    }

    @Test
    public void rotLeft_shouldReturnRotateArrayWith2() {

        //Given
        int[] a = new int[] {1, 2, 3, 4, 5};
        int[] rotatedArrayByOne = new int[] {3, 4, 5, 1, 2};

        //When
        int[] rotatedArray = LeftRotation.rotLeft(a, 2);

        //Then
        assertThat((Arrays.equals(rotatedArray, rotatedArrayByOne)))
                .isTrue();
    }
}