package useful.ch12;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Step7 {

    public static void main(String[] args) {
        // start 시간, end 시간
        // end - start = 소요시간
        LocalTime start = LocalTime.now();

        int sum = 0;
        for (int i = 1; i <= 100000000; i++) {
           sum += i;
        }
        System.out.println(sum);

        LocalTime end = LocalTime.now();

        Duration work =  Duration.between(start, end);
        System.out.println("시작 시간: " + start);
        System.out.println("종료 시간: " + end);
        System.out.println("소요 시간: " + work.toMillis());
    }

}
