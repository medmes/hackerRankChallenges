package hackerrank.strings;

public class RepearedString {
    /**
     * Big O(n) Time Complexity
     * @param s
     * @param n
     * @return
     */
    public static long repeatedString(String s, long n) {
        if (s.length() == 0) {
            return 0;
        }
        long countA = 0;
        // A = P*Q +R
        long qNumber = n / s.length();
        long rNumber = n % s.length();

        countA = countA(s) * qNumber;

        for (int i=0; i<rNumber; i++) {
            if ('a' == s.charAt(i)) {
                countA++;
            }
        }
        return countA;
    }

    private static long countA(String s) {
        long count = 0;
        for(int i=0; i<s.length(); i++) {
            if ('a' == s.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
