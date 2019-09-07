package courses.array;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ArrayTest {

    @Test
    public void getElementInIndexTwo () {
        //Given

        //When
        int[] array = Array.instannceStaticArray();

        //Then

        assertEquals(array[2], 30);
    }
    @Test
    public void getElementInIndexOne () {
        //Given

        //When
        int[] array = Array.instannceStaticArray();

        //Then

        assertEquals(array[1], 20);
    }
}