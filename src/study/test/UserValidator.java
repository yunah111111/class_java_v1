package study.test;

import java.util.Scanner;



public class UserValidator {

    private static final String id = "korit1234";
    private static final String pw = "123123!!";

    static final int SUCCESS = 0;
    static final int SHORT = 1;
    static final int MISMATCH = 2;

    public static int checkId(String idd) {

        if (idd.equals(id)) {
            return SUCCESS;
        } else if (idd.length() < id.length()) {
            return SHORT;
        } else {
            return MISMATCH;
        }
    }

    public static int checkPw(String pww) {

        if (pww.equals(pw)) {
            return SUCCESS;
        } else if (pww.length() < pw.length()) {
            return SHORT;
        } else {
            return MISMATCH;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("아이디를 입력하세요 >> ");
        String idd = sc.nextLine();

        System.out.print("비밀번호를 입력하세요 >> ");
        String pww = sc.nextLine();

        System.out.println("아이디 결과 : " + checkId(idd));
        System.out.println("비밀번호 결과 : " + checkPw(pww));
    }
}
