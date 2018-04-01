package paaalatine.logarithms;

public class LogN {

    public static double log(double x, int base) {

        if (base < 0 || base == 1) {
            throw new IllegalArgumentException();
        }

        return new Ln().calculate(x) / new Ln().calculate(base);
    }
}
