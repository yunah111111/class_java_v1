package exercise;

public class Exercise3 {

    public static void main(String[] args) {
        // 할인된 가격을 화면에 출력하는 코드 작성

        final double ORIGINAL_PRICE = 59.99;
        final double DISCOUNT_RATE = 0.30; // 30% 할인

        // 할인 계산식 찾아서 준비
        double discount = ORIGINAL_PRICE * (1 - DISCOUNT_RATE);

        // 할인된 계산 금액을 변수에 담아서 화면에 출력 (단, 정수값으로 출력)
        System.out.println((int) discount);


    }

}
