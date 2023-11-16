package Chang.day14;

public class cocacola {

        public int solution(int a, int b, int n) {

            int answer = 0;

            while(n>=a){
                answer=answer+(n/a*b);
                n=(n/a*b)+(n%a);
            }

            return answer;
        }
    }

