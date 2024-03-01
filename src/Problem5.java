import java.util.Arrays;
import java.util.HashMap;

public class Problem5 {

    public static int lenOfLongSubarr(int[] array, int k) {
        int length = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (sum == k) {
                length = i + 1;
            } else if (map.containsKey(sum-k)) {
                length = Math.max(length, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return length + 1;
    }
}
