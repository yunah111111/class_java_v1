package useful.ch17.me_study;

import java.util.Arrays;
import java.util.List;

public class Me_Study {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(result);

    }
}
