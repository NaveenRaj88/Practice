package hard;

public class ValidNumber {
    public static void main(String[] args) {
        String s = "0";
        boolean result = isNumber(s);
        System.out.println("Is valid number: " + result);
    }

    public static boolean isNumber(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return false;
        }
        boolean hasDecimal = false;
        boolean hasExponent = false;
        boolean hasDigit = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (c == '+' || c == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (c == '.') {
                if (hasDecimal || hasExponent) {
                    return false;
                }
                hasDecimal = true;
            } else if (c == 'e' || c == 'E') {
                if (hasExponent || !hasDigit) {
                    return false;
                }
                hasExponent = true;
                hasDigit = false; // reset for exponent part
            } else {
                return false;
            }
        }
        return hasDigit;
    }
}
