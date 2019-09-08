package hackerrank.wramup;



public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static String miniMaxSum(int[] arr) {
        //The output can be greater than a 32 bit integer, Long ;)
        Long sum = 0L;
        int min = arr[0];
        int max = arr[0];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sum += Long.valueOf(arr[i]);

            if (min > arr[i]) {
                min = arr[i];
            }

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return stringBuilder.append(String.valueOf(sum - max))
                            .append(" ")
                            .append(String.valueOf(sum - min))
                            .toString();
    }
}
