package Chang.day9;

import java.util.Arrays;

//문자열 내림차순으로 배치하기
public class arrString {

        public String solution(String s) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            StringBuffer sb = new StringBuffer(new String(arr));
            String answer = sb.reverse().toString();

            return answer;
        }

}
