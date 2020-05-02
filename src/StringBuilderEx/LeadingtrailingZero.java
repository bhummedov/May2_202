package StringBuilderEx;

import java.math.BigInteger;

public class LeadingtrailingZero {
    public static void main(String[] args) {
        removeLeadingTrailing("230.00");
    }

    public static void removeLeadingTrailing(String n) {
        StringBuilder s = new StringBuilder();
        for (int i = 0, k = 0, t = 0, y = 0; i < n.length(); i++) {
            while (n.charAt(k) == '0') {
                k++;
                t = k;
            }
            while (n.charAt(t) != '.') {
                s.append(n.charAt(t));
                t++;
                y = t;
            }
            while (n.charAt(y) == '0') {
                s.append(n.charAt(y));
                y++;
            }
        }
        System.out.println(s);
    }
}


