package hackerrank;

import hackerrank.dp.ExtraLongFactorials;
import org.junit.Test;

import java.math.BigInteger;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.*;

public class extraLongFactorialsTest {

    @Test
    public void extraLongFactorials_fatorialOfSix() {

        //Given

        //When
        BigInteger factorial = ExtraLongFactorials.extraLongFactorials(6);
        //Then
        assertThat(factorial)
                .isEqualTo(720);
    }

    @Test
    public void memoizedFibonacci_fatorialOfSix() {

        //Given
        ExtraLongFactorials.memo = new HashMap<>();

        //When
        BigInteger factorial = ExtraLongFactorials.memorizedExtraLongFactorials(6);
        //Then
        assertThat(factorial)
                .isEqualTo(720);
    }

    @Test
    public void extraLongFactorials_fatorialOfTweentyFive() {

        //Given

        //When
        // Nightmare calculation...
        BigInteger factorial = ExtraLongFactorials.extraLongFactorials(25);

        //Then
        assertThat(factorial)
                .isEqualTo(
                        new BigInteger("15511210043330985984000000"));
    }

    @Test
    public void memoizedFibonacci_fatorialOfTweentyFive() {

        //Given
        ExtraLongFactorials.memo = new HashMap<>();


        //When
        // Nightmare calculation...
        BigInteger factorial = ExtraLongFactorials.memorizedExtraLongFactorials(25);

        //Then
        assertThat(factorial)
                .isEqualTo(
                        new BigInteger("15511210043330985984000000"));
    }
}
