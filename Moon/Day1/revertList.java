package Day1;

public class revertList {
    public static void main(String[] args) {
        long[] answer = solution(12345);
        for (long l : answer) {
            System.out.println(l);
        }

        System.out.println();

        long[] answerbetter = solutionBetter(123456789);
        for (long l : answerbetter) {
            System.out.println(l);
        }
    }

    public static long[] solution(long n) {
        long count = 0;
        for (long i = n; i > 0; i/=10){
            count++;
        }
        long[] answer = new long[(int)count];
        String temp = String.valueOf(n);

        for (int i = 0; i < answer.length; i++){
            answer[i] = Long.valueOf(temp.substring((int)(count-1), (int)count));
            count--;
        }
        return answer;
    }

    // 이 로직이 더 빠르다고 생각했는데 변환하는 과정에서 더 오래걸림 ㅎㅎ;;
    public static long[] solutionBetter(long n) {
        int size = String.valueOf(n).length();
        long[] answer = new long[size];

        String[] list = String.valueOf(n).split("");
        for (int i = 0; i < list.length/2; i++) {
            int oppositeIndex = size - 1 - i;
            String opposite = list[oppositeIndex];
            list[oppositeIndex] = list[i];
            list[i] = opposite;
        }

        for (int i = 0; i < list.length; i++) {
            answer[i] = Long.parseLong(list[i]);
        }

        return answer;
    }
}
