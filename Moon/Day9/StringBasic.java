package Day9;

public class StringBasic {
    public static void main(String[] args) {
        System.out.println(solution("a1234"));
    }

    private static boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6)
            return false;

        char []chArr = s.toCharArray();
        for(int i=0; i<chArr.length; i++) {
            if( !isNumber(chArr[i]) )
                return false;
        }

        return true;
    }
    private static boolean isNumber(char c) {
        int A = c;
        return 48 <= A && A <= 57 ;
    }
}
