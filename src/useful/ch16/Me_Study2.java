package useful.ch16;

public class Me_Study2 {


    public static void main(String[] args) {

        StringOperation longer = (x, y) -> {
            if (x.length() > y.length()) {
                return x;
            } else {
                return y;
            }
        };

        System.out.println(longer.operate("사과", "바나나"));
    }
}
