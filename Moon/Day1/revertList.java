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
        long end2 = System.currentTimeMillis();
    }

    public static long[] solution(long n) {
//        long count = 0;
//        for (long i = n; i > 0; i/=10){
//            count++;
//        }
        long count = String.valueOf(n).length();
        long[] answer = new long[(int)count];
        String temp = String.valueOf(n);

        for (int i = 0; i < answer.length; i++){
            answer[i] = Long.parseLong(temp.substring((int)(count-1), (int)count));
            count--;
        }
        return answer;
    }

    // 이 로직이 더 빠르다고 생각했는데 변환하는 과정에서 더 오래걸림 ㅎㅎ;;
    // 이해완료 : .length 자체는 문자열의 모든 문자를 순회하며 세기 때문에 O(n)이 될 수 밖에 없음
    //           위 solution은 문자열의 자리수를 i/=10으로 나눴기 때문에 O(long(n))
    public static long[] solutionBetter(long n) {
        int size = String.valueOf(n).length();
        long[] answer = new long[size];

        String[] list = String.valueOf(n).split("");
        if (size % 2 == 1) {
            int centerIndex = size / 2;
            answer[centerIndex] = Long.parseLong(list[centerIndex]);
        }
        for (int i = 0; i < list.length/2; i++) {
            int oppositeIndex = size - 1 - i;
            String opposite = list[oppositeIndex];
            answer[i] = Long.parseLong(list[oppositeIndex]);
            answer[oppositeIndex] = Long.parseLong(list[i]);
        }

        return answer;
    }
}
