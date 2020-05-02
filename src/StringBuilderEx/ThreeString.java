package StringBuilderEx;

public class ThreeString{
    public static void main(String[] args) {
        StringBuilder myBuilder = new StringBuilder(50);
        System.out.println(myBuilder.capacity());
        myBuilder.append("Java");
        myBuilder.append(" is");
        myBuilder.append(" fun");
        System.out.println(myBuilder);
        myBuilder.insert(7," super");
        System.out.println(myBuilder);
        myBuilder.replace(14,17," strong");
        System.out.println(myBuilder);
        myBuilder.delete(0,5);
        System.out.println(myBuilder);
    }
}

