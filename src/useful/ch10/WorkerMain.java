package useful.ch10;

public class WorkerMain {

    // 메인 쓰레드
    public static void main(String[] args) {
        // 2. 사용하는 방법
        System.out.println("------ main 쓰레드 시작 ------");
        System.out.println(Thread.currentThread()); // 현재 실행 중인 쓰레드 가져옴

        // 필요하다면 작업자(쓰레드)를 만들어서 작업을 시킬 수 있음
        Worker worker1 = new Worker("작업자1");

        // 약속. 쓰레드에게 위임한 일을 시작 시킬려면 Thread 안에 있는 start() 메서드를 반드시 호출해야
        // run() 메서드 안에 정의된 로직이 시작이 됨
        worker1.start();
        // worker1.runt(); 하면 안 됨 이건 그냥 메서드 호출  즉, 새로운 쓰레드가 안 생김
        // 실행은 start();로
        System.out.println("------ main 쓰레드 종료 ------");

    }

}
