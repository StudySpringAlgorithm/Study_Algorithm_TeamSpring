package Day15;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class year2016 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;

        LocalDate date = LocalDate.of(2016, a, b);
        System.out.println(date);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);
        String answer = dayOfWeek.toString().substring(0,3);
        System.out.println(answer);

    }
}
