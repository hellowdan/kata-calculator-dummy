public class StrCalc {

    private static final String SEPARATOR = ",";

    public int add(String val) {
        String[] operands = val.split(SEPARATOR);

        int sum = 0;
        for (String operand : operands) {
            sum += parseNumber(operand);
        }

        return sum;
    }

    private int parseNumber(String str) {
        if (str.isEmpty()) {
            return 0;
        } else {
            return Integer.valueOf(str);
        }
    }
}
