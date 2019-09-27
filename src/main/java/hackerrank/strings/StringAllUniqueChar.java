package hackerrank.strings;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Check if a string has all unique Characters.
 * class StringAllUniqueChar
 */
public class StringAllUniqueChar {

    /**
     * Brute Force Solution approach, comparing each character with the rest of string.
     * O(n^2) + O(n)
     * @param s
     * @return
     */
    public static boolean isAllUnique(String s) {
        for (int i = 0; i<s.length(); i++) {
            for (int j = i +1; j<s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * HashTable approach offer O(nLog(n)) Time Complexity
     * the downside of this approach is adding an aditional space complexity
     * @param s
     * @return
     */
    public static boolean isAllUniqueUsingSorting(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i=0; i<chars.length -1; i++) {
            // if only two adjecent characters are equals, that's mean the string is not unique characters
            //it might will not reach till the end of string
            if (chars[i] == chars[i+1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * HashTable approach offer O(n)
     * Space Complexity O(n)
     * @param s
     * @return
     */
    public static boolean isAllUniqueUsingHashTable(String s) {
        HashSet<Character> characterHashSet = new HashSet<>();

        for (int i=0; i<s.length(); i++) {
            if (!characterHashSet.add(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
