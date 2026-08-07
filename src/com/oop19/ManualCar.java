package com.oop19;

public class ManualCar extends Car {
    @Override
    protected void drive() {  // 부모 클래스가 protected이면 자식도 protected여야함
        System.out.println("사람이 핸들을 직접 조각해서 운전을 합니다.");
    }

    @Override
    protected void stop() {
        System.out.println("사람이 브레이크를 밟아서 정지합니다.");
    }
}
