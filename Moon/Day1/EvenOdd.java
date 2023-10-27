package Day1;

public class EvenOdd {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100);
        System.out.println(num);
        System.out.println(solution(num));
        System.out.println(solutionBetter(num));
    }

    public static String solution(int num) {
        if (num % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static String solutionBetter(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
    // 간단한 2가지 조건의 경우 삼항연산자로 표현이 가능하다
    // (조건) ? (조건이 '참'일 경우 실행할 코드) : (조건이 '거짓'일 경우 실행할 코드 );

}