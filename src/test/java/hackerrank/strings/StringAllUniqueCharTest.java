package hackerrank.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringAllUniqueCharTest {

    @Test
    public void isAllUnique_shouldReturnTrue() {

        //Given + When
        boolean result = StringAllUniqueChar.isAllUnique("auCnkMwrp");
        //Then
        assertTrue(result);
    }

    @Test
    public void isAllUnique_shouldReturnFalse() {

        //Given + When
        boolean result = StringAllUniqueChar.isAllUnique("auCnkMwCrp");
        //Then
        assertFalse(result);
    }

    @Test
    public void isAllUniqueUsingSorting_shouldReturnTrue() {

        //Given + When
        boolean result = StringAllUniqueChar.isAllUniqueUsingSorting("auCnkMwrp");
        //Then
        assertTrue(result);
    }

    @Test
    public void isAllUniqueUsingSorting_shouldReturnFalse() {

        //Given + When
        boolean result = StringAllUniqueChar.isAllUniqueUsingSorting("auCnkMwCrp");
        //Then
        assertFalse(result);
    }

    @Test
    public void isAllUniqueUsingHashTable_shouldReturnTrue() {

        //Given + When
        boolean result = StringAllUniqueChar.isAllUniqueUsingHashTable("auCnkMwrp");
        //Then
        assertTrue(result);
    }

    @Test
    public void isAllUniqueUsingHashTable_shouldReturnFalse() {

        //Given + When
        boolean result = StringAllUniqueChar.isAllUniqueUsingHashTable("auCnkMwCrp");
        //Then
        assertFalse(result);
    }
}
