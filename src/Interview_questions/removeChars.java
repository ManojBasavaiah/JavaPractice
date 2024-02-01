package Interview_questions;

public class removeChars {
    public static void main(String[] args) {
        String s = "h7$#@2761345Man&*(??wit";
        //Regular expression:[^a-zA-Z0-9]
        String s1 = s.replaceAll("[^0-9]", "");
        String s2 = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s1 + " " + s2);
    }
}
