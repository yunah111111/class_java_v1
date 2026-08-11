package useful.ch17.me_study;

import java.util.Arrays;
import java.util.List;

public class Me_Study2 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 15, 7, 20, 10, 25);

        List<Integer> result = numbers.stream()
                .filter(n -> n > 10)
                .toList();
        System.out.println(result);

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result2 = number.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();
        System.out.println(result2);



    }
}
