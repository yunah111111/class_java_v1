package useful.ch16;

public class Demo1 {

    public static void main(String[] args) {
        // 1. 람다 표현식에 대해 알아보기

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("작업가 해야  일 정의");
            }
        }).start();

        // 위 코드를 람다식으로 사용
        new Thread(() -> System.out.println("여기도 작업자가 해야 할 일 정의")).start();


    }
}
