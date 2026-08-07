package com.oop10;

public class Company { // Company라는 클래스(설계도) 만듦

    static String companyName = "코리아회사";
    /**
     * static이 없으면 객체마다 따로 생김
     * ex)
     * 회사1 - companyName = 코리아 회사
     * 회사2 - companyName = 코리아 회사
     * 각자 가지고 있음
     *
     * static이 있으면
     * 객체가 몇 개든 하나만 존재
     * companyName = 코리아 회사
     * 이걸 모든 객체가 같이 사용함
     *
     * ex)
     * 직원 1 직원 2 직원 3 모두 Company.companyName을 봄
     * => 회사 이름은 하나니까 하나만 만들어 놓은 것
     */
    static int empSerialNumber = 1001;
    /**
     * 사원 번호 시작값
     * 처음에는 1001부터 시작한다
     */

}
