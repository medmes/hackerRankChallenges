package hackerrank.strings;

import org.junit.Test;

import java.sql.Time;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class TimeConversionTest {

    private static final String TIME = "07:05:45PM";

    private static final String CONVERTED_TIME = "19:05:45";

    private static final String LUNCH_TIME = "12:05:45PM";

    private static final String CONVERTED_LUNCH_TIME = "12:05:45";

    private static final String MIDNIGHT_TIME = "12:05:45AM";

    private static final String CONVERTED_MIDNIGHT_TIME = "00:05:45";

    @Test
    public void timeConversion_shouldReturnTimeWithouthAMorPM() {
        //Given

        //When

        String s = TimeConversion.timeConversion(TIME);

        //Then
        assertThat(s)
                .isNotEmpty();
        assertThat(s)
                .isNotBlank();
        assertThat(s)
                .doesNotContain("AM", "PM");
    }

    @Test
    public void timeConversion_shouldReturnTimeExactlyLike19_05_45() {
        //Given

        //When
        String s = TimeConversion.timeConversion(TIME);

        //Then
        assertThat(s)
                .isNotEmpty();
        assertThat(s)
                .isNotBlank();
        assertThat(s)
                .isEqualTo(CONVERTED_TIME);
    }

    @Test
    public void timeConversion_shouldReturnTimeAs_12_05_45_forLunchTime() {
        //Given

        //When
        String s = TimeConversion.timeConversion(LUNCH_TIME);

        //Then
        assertThat(s)
                .isNotEmpty();
        assertThat(s)
                .isNotBlank();
        assertThat(s)
                .isEqualTo(CONVERTED_LUNCH_TIME);
    }

    @Test
    public void timeConversion_shouldReturnTimeAs_00_05_45_forMidNightTime() {
        //Given

        //When
        String s = TimeConversion.timeConversion(MIDNIGHT_TIME);

        //Then
        assertThat(s)
                .isNotEmpty();
        assertThat(s)
                .isNotBlank();
        assertThat(s)
                .isEqualTo(CONVERTED_MIDNIGHT_TIME);
    }
}
