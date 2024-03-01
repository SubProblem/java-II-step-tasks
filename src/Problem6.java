import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem6 {

    public static boolean isValidSequence(int[] array, int[] sequence) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        int globalIndex = -1;


        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (!map.containsKey(num)) {
                map.put(num, new ArrayList<>());
            }
            map.get(num).add(i);
        }

        for (int num : sequence) {
            if (!map.containsKey(num)) {
                return false;
            }

            List<Integer> indices = map.get(num);
            boolean found = false;

            for (int index : indices) {
                if (index > globalIndex) {
                    globalIndex = index;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
