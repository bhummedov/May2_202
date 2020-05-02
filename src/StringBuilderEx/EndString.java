package StringBuilderEx;

public class EndString {
    public static void main(String[] args) {
        String str1 = "Java Rocks";
        String str2 = "cks";
        System.out.println(isEndsSame(str1,str2));
    }
    public static boolean isEndsSame(String str, String end){

        int startIndex = str.length()-end.length(); //to find starting index of ending String
        int endIndex = str.length(); // end index of the ending string
        if(str.substring(startIndex,endIndex).equals(end)){
            return true;
        }
        else {
            return false;
        }

    }
}

