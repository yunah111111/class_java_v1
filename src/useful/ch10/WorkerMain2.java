package useful.ch10;

public class WorkerMain2 {

    // 메인 쓰레드
    public static void main(String[] args) {

        System.out.println("------ main 쓰레드 시작 ------");

        Worker2 worker2 = new Worker2();
        // 아직 Thread아님
        // tip 쓰레드를 동작시키려면 무조건 Thread에 start() 메서드 호출
        // worker2.start(); <--- start() 없는 상태임

        new Thread(worker2).start(); // 많이 씀
        // 그래서 Thread로 감싸야함

//        Thread t =new Thread(worker2);
//        t.start();
//        얘랑 같은 코드임


        System.out.println("------ main 쓰레드 종료 ------");


    }

}
