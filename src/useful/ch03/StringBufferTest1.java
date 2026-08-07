package useful.ch03;

public class StringBufferTest1 {

    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("World");

        // 1. StringBuffer 사용하는 방법
        // StringBuffer buffer1 = new StringBuffer("Hello"); // 같은 거임
        StringBuffer buffer1 = new StringBuffer(str1);
        System.out.println(System.identityHashCode(buffer1));

        // 2. 문자열을 더하기 하기
        buffer1.append(str2);
        System.out.println(buffer1);
        System.out.println(System.identityHashCode(buffer1));  // 주소값 같음

        // 3. StringBuffer --> String으로 형 변환하는 방법
        String str3 = buffer1.toString(); // toString 호출 시 String 타입으로 변환 됨

        // 결론
        // StringBuffer 사용하면 새 객체를 만들지 않고 내부 상태값을 바꾸기 때문에 메모리 낭비를 막을 수 있음
        // 즉 문자열을 많이 변경하는 로직이라면 StringBuffer를 사용하는 것이 좋다 ex) 메신저 앱 같은


    } // end of main

} // end of class
