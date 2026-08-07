package com.oop15;

public class Room {

    // 필드
    private String type;

    // 생성자
    public Room(String type) {
        this.type = type;
    }

    public void use() {
        System.out.println(type + "공간을 사용 중입니다.");
    }

}
