package Day4;

public class harshad {
    public static void main(String[] args) {
        System.out.println(isHashad(10));
        System.out.println(isHashad(12));
        System.out.println(isHashad(11));
        System.out.println(isHashad(13));
    }

    private static boolean isHashad(int x) {
        int divisor = 0;
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            divisor += Integer.parseInt(str.substring(i, i+1));
        }

        return x % divisor == 0;
    }
}
