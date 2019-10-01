package hackerrank.arrays;

import java.util.List;

public class FindNumber {

    /**
     * Find Number in a unSorted array and pring YES if exist, NO if not.
     * O(n) Time Complexity
     * @param arr
     * @param k
     * @return
     */
    public static String findNumber(List<Integer> arr, int k) {

        for (int i=0; i<arr.size(); i++) {
            if (k == arr.get(i)) {
                return "YES";
            }
        }
        return "NO";
    }
}
