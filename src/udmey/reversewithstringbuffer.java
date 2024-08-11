package udmey;

public class reversewithstringbuffer {
    public static void main(String[] args) {

        String str = "MaMk";
        StringBuffer rev = new StringBuffer(str);
        System.out.println(rev.reverse());
        if (str.equalsIgnoreCase(String.valueOf(rev.reverse()))) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
