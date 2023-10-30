package Chang.day2;

//대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
//s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 함수를 완성하는 문제

public class poryCompare {
    boolean solution(String s) {

        boolean answer = true;

        int P=0; //P의 갯수를 저장하는 변수
        int Y=0; //Y의 갯수를 저장하는 변수

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p'||s.charAt(i)=='P'){
                P+=1;
            }
            else if(s.charAt(i)=='y'||s.charAt(i)=='Y'){
                Y+=1;
            }
        }

        if(P!=Y){ //p와 y의 갯수 비교
            answer=false;
        }

        return answer;
    }
}

/* cout
class Solution {
    boolean solution(String s) {
        s = s.toLowerCase(); // 알파벳 소문자로 변환한 새로운 문자열을 리턴, toUpperCase()는 대문자로 변환한 문자열을 리턴
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;
    }
}
 */

