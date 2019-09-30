package hackerrank.arrays;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i<arr.size(); i++) {
            rightSum += arr.get(i).get(i);
            leftSum += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(rightSum - leftSum);
    }
}
