package hackerrank.wramup;

/**
 * O(n) Time Complexity
 * Hotel Number of Lucky Floor.
 * https://www.hackerrank.com/contests/booking-com-passions-hacked-frontend/challenges/the-elevator-superstition/problem
 */
public class HotelLuckyNumber {

    public static int processData(int n) {
        for (int i=0; i<=n; i++) {
            String s = String.valueOf(i);
            if (s.endsWith("4") || s.endsWith("13")) {
                n++;
            }
        }
        return n;
    }
}
