package Day27;

public class rolling {

    public static void main(String[] args) {

        System.out.println(solution("[)(]"));
    }

    private static int solution(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int answer = 0;


        for (int i = 0; i < s.length(); i++) {
            if (isAvilable(sb.toString())) {
                answer++;
            }
            System.out.println(sb);
            sb.insert(0, sb.charAt(sb.length()-1));
            sb.delete(sb.length()-1, sb.length());
        }
        return answer;
    }

    private static boolean isAvilable(String s) {
        int count = 0;

        for (int i = 0; i < s.length()/2; i++) {
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            s = s.replace("()", "");
            if (s.isEmpty()) {
                return true;
            }
            if (s.startsWith("}") || s.startsWith("]") || s.startsWith(")")) {
                return false;
            }
        }
        return false;

    }

}
