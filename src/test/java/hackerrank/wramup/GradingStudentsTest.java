package hackerrank.wramup;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class GradingStudentsTest {

    @Test
    public void gradingStudents_shouldReturnListRounded() {

        //Given
        List<Integer> arr = Arrays.asList(73, 67, 38, 33);
        List<Integer> finalGrading = Arrays.asList(75, 67, 40, 33);

        //When
        List<Integer> gradingStudentsList = GradingStudents.gradingStudents(arr);

        //Then
        assertThat(gradingStudentsList)
                .isNotNull();
        assertThat(gradingStudentsList)
                .isEqualTo(finalGrading);
    }

}
