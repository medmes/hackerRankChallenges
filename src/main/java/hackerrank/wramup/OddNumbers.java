package hackerrank.wramup;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

    public static List<Integer> odd(int l, int r) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=l; i<=r; i++) {
            if (i%2 != 0)
                arrayList.add(i);
        }
        return arrayList;
    }
}
