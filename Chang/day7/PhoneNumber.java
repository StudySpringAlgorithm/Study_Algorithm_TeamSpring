package Chang.day7;

public class PhoneNumber {

    public String solution(String phone_number) {
        String answer = "";

        char[] num=phone_number.toCharArray();

        for(int i=0;i<num.length-4;i++){
            num[i]='*';
        }

        answer=new String(num);

        return answer;
    }

}
