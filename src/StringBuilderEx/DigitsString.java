package StringBuilderEx;

public class DigitsString {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("019846515641564");
        System.out.println(builder.codePointAt(2));
        System.out.println(isAllDigit(builder));
    }

    public static boolean isAllDigit(StringBuilder str) {
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if (!(str.codePointAt(i) >= 48 && str.codePointAt(i) <= 57)) {
                result = false;

            }
        }
        return result;
    }
}

