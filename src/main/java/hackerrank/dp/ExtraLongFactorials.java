package hackerrank.dp;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class ExtraLongFactorials {

    public static Map<Integer, BigInteger> memo = new HashMap<>();

    /**
     * extraLongFactorials
     * n as Integer
     * O(n!) Time Complexity.
     * @param n
     * @return
     */
    public static BigInteger extraLongFactorials(int n) {
        if (n <= 1)
            return BigInteger.ONE;
        return BigInteger.valueOf(n)
                .multiply(extraLongFactorials(n - 1));
    }

    // Factorial calculation using memorizing:(Dynamic Programming)
    // Extra space as drawback, O(n) but it perform very well
    // in term of time complexity compared to the classical calculation.
    public static BigInteger memorizedExtraLongFactorials(int n) {
        if (n <= 1)
            return BigInteger.ONE;

        if (memo.get(n) == null) {
            //If the element is not in the hashmap, we then calculate it and add it.
            memo.put(n,
                    BigInteger.valueOf(n)
                            .multiply(memorizedExtraLongFactorials(n-1))
            );
        }
        return memo.get(n); //return the treemap.
    }
}
