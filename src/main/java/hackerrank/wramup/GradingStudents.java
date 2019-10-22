package hackerrank.wramup;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    private GradingStudents() {
    }

    /*
     * O(n) Space Complexity: additional space, we can improve this by making in place channges of the grades input list!
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> finalGrading = new ArrayList<>();
        grades.forEach(grade -> {

            if (grade < 38) {
                finalGrading.add(grade);
                return;
            }
            int i = grade;

            while (i % 5 != 0) {
                i++;
            }
            if (i - grade < 3) {
                finalGrading.add(i);
            } else {
                finalGrading.add(grade);
            }

        });
        return finalGrading;
    }

}
