package useful.ch16;

public class Me_Study {

    public static void main(String[] args) {

        MathOperation add = (x, y) -> x + y;
        System.out.println(add.operate(10, 20));


        MathOperation compare = (x, y) -> {
            if (x > y) {
                return x;
            } else {
                return y;
            }
        };

    }

}
