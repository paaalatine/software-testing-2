package paaalatine;

import static org.junit.Assert.assertEquals;

public class TestUtil {

    private AbstractFunction function;

    public TestUtil(AbstractFunction function) {
        this.function = function;
    }

    public void check(double x, double precision) {
        function.setIsStub(true);
        double expected = function.calculate(x);
        function.setIsStub(false);
        double actual = function.calculate(x);
        assertEquals(expected, actual, precision);
    }

    public void checkRange(double from, double to, double step, double precision) {
        for(double x = from; x < to; x += step)
                check(x, precision);

    }
}
