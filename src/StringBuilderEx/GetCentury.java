package StringBuilderEx;

public class GetCentury{
    public static void main(String[] args) {
        int test = centuryFromYear(1756);
        System.out.println(test);
    }
    static int centuryFromYear(int year) {
        if (year % 100 == 0) {
            year = year / 100;
        } else {
            year = (year / 100) + 1;
        }
        return year;
    }
}
