package hackerrank.wramup;


import java.util.ArrayList;

public class DeltaEncoding {

    private static final int TOKEN = -128;

    private static final int SIGNED_BYTE = 127;

    public static int[] perform(int[] array) {
        if (array.length == 0) {
            return array;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(array[0]);

        for (int i=0; i<array.length - 1; i++) {
            int delta = array[i +1] - array[i];
            if (Math.abs(delta) > SIGNED_BYTE) {
                arrayList.add(TOKEN);
            }
            arrayList.add(delta);
        }

        return arrayList
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
