package useful.ch16;

@FunctionalInterface // 얘가 실수로 int test() 뭐 이런 거 더 추가하면 컴파일러가 오류 알려줌
// 왜냐면 메서드는 하나만 있어야하기 때문
public interface MathOperation {
    int operate(int x, int y);
    // void run();
}

// MathOperation 안에 추상 메서드가 딱 하나 있음
/**
 * 그러면
 * MathoOperation add2 = (int x, int y) -> x + y;가 가능해짐
 * => MathOperation 타입의 변수 add2에 람다식을 넣는다는 뜻
 */

