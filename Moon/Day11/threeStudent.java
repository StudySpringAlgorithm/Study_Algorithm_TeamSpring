package Day11;

public class threeStudent {
    public static void main(String[] args) {

    }

    public int solution(int[] number) {
        int answer = 0;
        int length = number.length;
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++){
                for (int k = 0; k < length; k++){
                    if (i != j & i != k & j != k){
                        if (number[i] + number[j] + number[k] == 0){
                            answer++;
                        }
                    }
                }
            }
        }

        return answer/6;
    }
}
