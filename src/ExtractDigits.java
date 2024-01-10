class ExtractDigits {
    public static String extractDigits(int n) {
        int count=0;
        while(n!=0){
            int lastdigit=n%10;
            n=n/10;
            count++;
        }
        return String.valueOf(count);

    }


    public static void main(String[] args) {
        System.out.println(extractDigits(12345));

    }
}
