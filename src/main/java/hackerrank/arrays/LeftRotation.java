package hackerrank.arrays;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        for (int i = 0; i<d; i++) {
            int temp = a[0];
            int j;
            for (j = 0; j< a.length - 1; j++) {
                a[j] = a[j +1];
            }
            a[j] = temp;
        }
        return a;
    }
}
