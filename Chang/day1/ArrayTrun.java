package Chang.day1;

import static java.lang.String.*;

//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴하는 함수를 작성하는 문제
public class ArryTrun {
        public int[] solution(long n) {
            String num= valueOf(n);
            int[] answer = new int[num.length()];

            for(int i=0;i<num.length();i++){
                answer[i]=(int)(n%10);
                n/=10;
            }

            return answer;
        }
    }

