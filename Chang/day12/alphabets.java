package Chang.day12;

public class alphabets {
    public int solution(String s) {
        int answer = 0;
        //StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        //replaceAll (a,b) a를 b로 치환해줌
        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        answer=Integer.parseInt(s);

        return answer;
    }
}
