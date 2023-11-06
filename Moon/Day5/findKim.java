package Day5;

public class findKim {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Moon", "Chang", "Kim", "Choi"}));
    }

        public static String solution(String[] seoul) {
            int where = 0;
            String answer = "";
            for (int i = 0; i < seoul.length; i++) {
                if (seoul[i].equals("Kim")) {
                    answer = "김서방은 " + i + "에 있다";
                }
            }
            return answer;
        }
}
