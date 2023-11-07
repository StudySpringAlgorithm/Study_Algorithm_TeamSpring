package Chang.day6;

public class nullnumsum {

    public int solution(int[] numbers) {
        int answer = 0;

        for(int i=0;i<numbers.length;i++){
            answer+=numbers[i];
        }
        answer=45-answer;

        return answer;
    }
}
