package useful.ch12;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Step6 {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2005, 10,  11);
        LocalDate today = LocalDate.of(2026, 8,  7);
        LocalDateTime now = LocalDateTime.of(2025, 5, 13, 2, 30);
        LocalDate christmas = LocalDate.of(2025, 12,  25);

        System.out.println("생일 요일: "  + birthday.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));

        Period age = Period.between(birthday, today);
        System.out.println("만 나이: " + age.getYears() + "세");

        long day = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("살아온 날 " + day);

        long dDay = ChronoUnit.DAYS.between(now.toLocalDate(),christmas);
        System.out.println("크리스마스까지: " + dDay);

        DateTimeFormatter korean = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 오후 hh시 mm분");
        System.out.println("현재: " + now.format(korean));

    }

}
