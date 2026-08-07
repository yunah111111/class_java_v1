package com.oop10;

public class Employee { // 직원 한 명을 만드는 설계도임

    int employeeNumber; // 고유 사원 번호 - 직원마다 달라야 하니까 Static이 아님
    private String name;
    // private 밖에서 못 건드리게 잠가놓음 => emp1.name 이렇게 못씀 나중에 get/set으로 접근 ㄱㄱ
    private String department; // 부서

    // 문제 상황 - 직원 객체를 생성할 때마다 자동으로
    // Company 의 시리얼 번호를 활용해서 1001 , 또 직원이 생성이 되면 1002 ....
    // 자동으로 할당 할 수 있도록 코드를 완성해주세요


    // 생성자 - 객체를 만들 때 자동으로 실행되는 메서드
    public Employee(String name, String department) {
        this.name = name;
        // 객체 안에 있는 변수 Employee(부서) 안에 있는 변수임 -> 객체 안의 name = "홍길동"
        this.department = department;
        // 답)
        employeeNumber = Company.empSerialNumber;
        Company.empSerialNumber++;
    }

}
