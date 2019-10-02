package hackerrank.wramup;

import org.junit.Test;

import static org.junit.Assert.*;

public class HotelLuckyNumberTest {

    @Test
    public void processData_shouldReturn15WhenNisEqualTo12() {
        //Given + When
        int luckyNumber = HotelLuckyNumber.processData(12);
        //Then
        assertEquals(15, luckyNumber);
    }
}
