package Home55_56;

import static java.lang.System.*;

public class Delenie {
    public static void main(String[] args) {
        System.out.println("Первый вариант " + delenieOne(2, 0));
        out.println("Второй вариант ");
        try {
            System.out.println(delenieTwo(10, 0));

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

    }

    static double delenieOne(int one, int two) {
        double result = 0.0;
        try {
            result = (double) one / two;
        } catch (ArithmeticException e) {
            out.println(e.getMessage());

        }
        return result;
    }

    static double delenieTwo(int one, int two) {
        return one / two;
    }
}
