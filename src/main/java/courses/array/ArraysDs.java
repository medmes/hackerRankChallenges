package courses.array;

public class ArraysDs {

    static int[] reverseArray(int[] a) {
        if(a == null || a.length <= 1){
            return a;
        }

        int n = a.length;
        /**
         *  This approach by adding a space complexity as N
         *    int[] aa = new int[n];
         *    for (int i = 0; i<n; i++) {
         *    aa[i] = a[n - i -1];
         *    }
         */
        // This approach swapping in place
        //no need to traverse the whole array ;)
        for (int i = 0; i < n / 2; i++) {
            //Swap numbers
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        return a;
    }
}
