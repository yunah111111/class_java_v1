package com.oop18;

public abstract class Human extends Animal {
    // abstract 쓰면 new 못씀
    // 추상 클래스의 정의:
    // Animal에는 추상 메서드가 존재하고 있음
    // 부모의 모든 것을 받았기 때문에 추상 메서드를 가지는 형태가 된다. - Human
    // 추상 메서드를 ---> 일반 구현 메서드로 재정의하면 추상 메서드가 Human에서는 사라지게 된다.

    // 추상 메서드 --> 구현 메서드로 재정의
//    @Override
//    public void hunt() {
//        System.out.println("사람이 도끼로 사냥을 합니다.");
//    }

    public static void main(String[] args) {
//        Animal animal = new Human();
//        animal.hunt();
        // Animal 직접 new하지 못하는 강제성을 발휘할 수 있음
    }

}
