package Interview_questions;

public class findObjectType {
    public static void main(String[] args) {
        Object a = 1344.7;

        if (a instanceof Integer) {
            System.out.println("Integer");
        } else if (a instanceof String) {
            System.out.println("String");
            String str = new StringBuffer(String.valueOf(a)).reverse().toString();
            System.out.println(str);
        } else {
            System.out.println("Neither Integer nor String");


        }

    }
}
