package hackerrank.strings;


public class TimeConversion {

    private TimeConversion() {
    }

    /**
     * Time Complexity O(n) due to copy string into char array.
     * Space Complexity O(n - 2) + O(1) for In place modification.
     * Complete the timeConversion function below.
     * Constraints:
     * All input times are valid (no need to double check s input format).
     */
    static String timeConversion(String s) {

        char[] timeChars = s.toCharArray();

        if (timeChars[timeChars.length - 2] == 'A' && s.substring(0, 2).equals("12")) {
            timeChars[0] = '0';
            timeChars[1] = '0';
        } else if (timeChars[timeChars.length - 2] == 'P' && !s.substring(0, 2).equals("12")) {
            String ss = "" + (Integer.parseInt(s.substring(0, 2)) + 12);
            timeChars[0] = ss.charAt(0);
            timeChars[1] = ss.charAt(1);
        }

        return String.copyValueOf(timeChars, 0, timeChars.length - 2);
    }
}
