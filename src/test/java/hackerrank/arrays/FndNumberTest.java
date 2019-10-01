package hackerrank.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FndNumberTest {

    @Test
    public void findNumber_shouldReturnYes() {

        //Given
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 1));
        //When

        String s = FindNumber.findNumber(arr, 5);
        //Then
        assertEquals("YES", s);
    }

    @Test
    public void findNumber_shouldReturnNo() {

        //Given
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 1));
        //When

        String s = FindNumber.findNumber(arr, -1);
        //Then
        assertEquals("NO", s);
    }
}
