public class Problem1 {

    public static int evaluateExpression(String expression) {

        char operator = '+';
        String number = "";
        int sum = 0;

        char[] charArr = expression.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '+' || charArr[i] == '-') {
                if (i == 0) {
                    operator = charArr[i];
                    continue;
                }
                if (operator == '+') {
                    sum += Integer.parseInt(number);
                    number = "";
                    operator = charArr[i];
                } else if (operator == '-') {
                    sum -= Integer.parseInt(number);
                    number = "";
                    operator = charArr[i];
                }
            } else {
                number += charArr[i];
                if (i == charArr.length - 1) {
                    if (operator == '+') {
                        sum += Integer.parseInt(number);
                    } else {
                        sum -= Integer.parseInt(number);
                    }
                }
            }
        }

        return sum;
    }

}
