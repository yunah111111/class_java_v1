package com.oop10;

public class StaticRuleTest {

    private String version = "1.0.0"; // 인스턴스 변수
    private static String appName = "로또 번호 생성기"; // static 변수

    // 인스턴스 메서드
    public String getVersion() {
        System.out.println(appName);
        System.out.println(version);
        System.out.println(makeMessage()); // 얘는 static 메서드인데 왜 호출이 될까
        return version;
    }

    // static 메서드
    public static String makeMessage() {
        System.out.println(appName); // appname <-- static 변수
        // 아지기 객체가 생성되지 않은 상태일 수 있기 때문에 사용 못 하게 막음
//        System.out.println(version); // version <-- 인스턴스 변수
//        System.out.println(getVersion());
//        System.out.println(this);

        return appName + "입니다.";
    }

}
