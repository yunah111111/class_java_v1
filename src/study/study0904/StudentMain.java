package study.study0904;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student("홍길동", 20);

        System.out.println(student.getName());

        student.setName("김철수");
        student.setAge(25);

        student.showInfo();
    }
}
