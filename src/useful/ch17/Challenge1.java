package useful.ch17;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Challenge1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 도전 과제 1 - Stream API 사용하지 않고 만들어보기
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                System.out.println(n * n);
            }
        }

        List<Integer> result2 = new ArrayList<>();
        System.out.println(result2.isEmpty());

        // 2. 하나씩 꺼내서 처리
        for (int n : numbers) {
            // 3. 조건을 검사한다. 만약 짝수라면 (filter)
            if (n % 2 == 0) {
                // 4. 값을 변경한다 (map)
                int square = n * n;
                // 5. 값을 담아준다. (toList에 해당)
                result2.add(square);

            }
        }


//        List<Integer> result = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .map(n -> n * n)
//                .toList();
//        System.out.println(result.toString());  // toString 생략 가능

    }

}
