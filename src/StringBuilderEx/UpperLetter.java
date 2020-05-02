package StringBuilderEx;

public class UpperLetter {
    public static void main(String[] args) {
        String str = "MR.MUSTAFA is a cool java instructor ";
        StringBuilder myBuilder = new StringBuilder(str);
        for (int i = 0; i < myBuilder.length(); i++) {
            // Converts lower to Upper
            if (myBuilder.charAt(i) >= 97 && myBuilder.charAt(i) <= 122) {
                System.out.print((char)(myBuilder.charAt(i) - 32));
            }
            // Converts upper to lower
            else if (myBuilder.charAt(i)>=65 && myBuilder.charAt(i)<=97){
                System.out.print((char)(myBuilder.charAt(i)+32));
            }
        }
    }
}
