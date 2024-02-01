package udmey;

public class Practice {
    String a = "Manoj";

    public static void main(String[] args) {
//		Objects=> instance of methods
        Practice pr = new Practice();
        SecondClass pr2 = new SecondClass();
        pr2.setData();
        pr.getData();

        System.out.println(pr.a);
        System.err.println(pr.a.charAt(4));
        /**Standard Output (stdout): This is where normal output is directed.
         //Standard Error (stderr): This is where error messages and other diagnostic information are directed.
         //When you use System.err.println, you are printing the specified message to the standard error stream. Here's a brief breakdown:
         //
         //System is a class in Java's java.lang package.
         //err is a static field within the System class that represents the standard error stream (PrintStream).
         //println is a method of the PrintStream class, used to print a line of text to the output stream.**/


    }

    //	Methods
    public String getData() {
        System.out.printf("My name is: ", a);
        return a;
    }

}
