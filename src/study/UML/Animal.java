package study.UML;

public class Animal {

    private String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("말하다.");
    }

    public void showInfo()  {
        System.out.println("정보 조회");
    }

}
