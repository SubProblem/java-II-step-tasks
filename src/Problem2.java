import java.util.List;

public class Problem2 {

    public static int numberOfHappyString(List<String> strings) {

        int num = 0;
        boolean checked = false;

        for (String s : strings) {
            var charArr = s.toCharArray();
            for (int i = 0; i < charArr.length-1; i++) {

                if (charArr[i] == charArr[i+1]) {
                    checked = false;
                    break;
                }
                checked = true;
            }
            if (checked == true) {
                num++;
            }
        }
        return num;
    }
}
