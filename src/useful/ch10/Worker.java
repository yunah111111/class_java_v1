package useful.ch10;

// 1. 쓰레드를 추가로 만들어서 사용하는 방법 - 상속 활용

public class Worker extends Thread {

    String name;

    public Worker(String name) {
        this.name = name;
    }

    // 약속되어 있는 부분 run() 추상메서드 안에서 작업자(쓰레드)에게
    // 어떤 일을 시킬지 정의해 주어야 함
    @Override
    public void run() { // run() - 쓰레드가 시작하면 여기 있는 코드 실행하라는 뜻
        for (int i = 0; i < 10; i++) {
            System.out.println("worker : " + name + " : " + i);

            try {
                Thread.sleep(1000); // 현재 쓰레드 1초 멈추기 (1000ms = 1초)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
