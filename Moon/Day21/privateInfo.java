package Day21;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class privateInfo {

    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        System.out.println(solution(today, terms, privacies));
    }

    private static List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        int todayYear = Integer.parseInt(today.substring(0,4));
        int todayMonth = Integer.parseInt(today.substring(5,7));
        int todayDay = Integer.parseInt(today.substring(8,10));

        int index = 1;
        for (String privacie : privacies ) {
            int privacieYear = Integer.parseInt(privacie.substring(0,4));
            int privacieMonth = Integer.parseInt(privacie.substring(5,7));
            int privacieDay = Integer.parseInt(privacie.substring(8,10));
            for (String term : terms) {
                String type = term.split(" ")[0];
                int num = Integer.parseInt(term.split(" ")[1]);
                if (privacie.endsWith(type)) {
                    privacieMonth += num;
                    while (privacieMonth > 12) {
                        privacieYear++;
                        privacieMonth -= 12;
                    }
                    while (privacieMonth <= 0) {
                        privacieYear--;
                        privacieMonth += 12;
                    }
                    if ((privacieYear < todayYear) || (privacieYear == todayYear && privacieMonth < todayMonth) ||
                        (privacieYear == todayYear && privacieMonth == todayMonth && privacieDay <= todayDay)) {
                        answer.add(index);
                    }
                }
            }
            index++;
        }

        return answer;
    }

    private static void checkOver12(int year, int month) {
        while (month > 12) {
            year++;
            month -= 12;
        }
        while (month <= 0) {
            year--;
            month += 12;
        }
    }

}
