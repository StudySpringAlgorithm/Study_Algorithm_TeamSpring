package Day15;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class year2016 {
    public static void main(String[] args) {

    }

    private static String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString().substring(0,3);
    }
}
