package hackerrank.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DiagonalDifferenceTest {

    @Test
    public void diagonalDifference() {

        //Given
        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(11, 2, 4));
        ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(10, 8, -12));
        arr.add(row1);
        arr.add(row2);
        arr.add(row3);

        //When
        int difference = DiagonalDifference.diagonalDifference(arr);

        //Then
        assertEquals(difference, 15);

    }
}
