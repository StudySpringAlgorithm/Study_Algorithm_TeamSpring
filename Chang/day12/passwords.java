package Chang.day12;

public class passwords {

    public String solution(String s, int n) {
        String answer = "";
        char[] str=s.toCharArray();

        for(int i=0;i<str.length;i++){
            if(str[i]==' '){
                continue;
            }
            else{
                if(str[i]>='a'&&str[i]<='z'){
                    if(str[i]+n>'z')
                        str[i]=(char)(str[i]-26+n);
                    else
                        str[i]+=n;
                }
                if(str[i]>='A'&&str[i]<='Z'){
                    if(str[i]+n>'Z')
                        str[i]=(char)(str[i]-26+n);
                    else
                        str[i]+=n;
                }
            }
        }

        answer=new String(str);

        return answer;
    }

}
