package useful.ch12;

import java.time.Duration;
import java.time.LocalDateTime;

public class Step7 {

    public static void main(String[] args) {

        int a = 0;
        int b = 100000000;
        for (int i = 1; i <= b; i++) {
           a += i;
            System.out.println(a);
        }

//        Duration work =  Duration.between(a, end);
//        System.out.println("총: " + work.toSeconds() + "초");

    }

}
