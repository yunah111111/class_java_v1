package useful.ch04;

public class PasswordMain {

    public static void main(String[] args) {
        // String password = "123123";
        Password password = new Password();

        try {
            // password.setpassword(null);
            password.setPassword("123");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("비정상 종료 안 됨");

    }

}
