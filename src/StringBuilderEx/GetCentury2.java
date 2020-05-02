package StringBuilderEx;

public class GetCentury2{
    public static void main(String[] args) {
        calculateCentury(1801);
    }
    public static void calculateCentury(int year){
        String cent = ""+ year;
        String firstTwo = cent.substring(0,2);
        String secondTwo = cent.substring(2,4);
        if(secondTwo.equals("00")){
            System.out.println(firstTwo);
        }
        else{
            int century = Integer.parseInt(firstTwo);
            System.out.println(++century);
        }
    }
}
