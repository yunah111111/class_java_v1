package study.static01;

public class Student {

    public static int studentNumber = 1000; // 필드

    public String name; // 필드
    public int studentId; // 필드
    // 나이를 static으로 설정하면 안 되는 이유
    // static은 공용 => 나이 공용으로 하면 하나 바꾸면 다 바꿔야 함

    public Student(String name) {
        this.name = name;
        // 인스턴스 변수 학번에 static 변수 기준 값을 활용해서 중복되지 않게 학번 자동 할당
        // 객체가 생성될 때마다
        studentId = studentNumber;
        studentNumber++;
    }

    // static 메서드 만들기
    public static String schoolStartTime = "9:00"; // 필드

    public int className; // 필드
    public String breakTime;

    // 생성자
    public Student (int className) {
        this.className = className;

        breakTime = schoolStartTime;
        // breakTime
    }

}
