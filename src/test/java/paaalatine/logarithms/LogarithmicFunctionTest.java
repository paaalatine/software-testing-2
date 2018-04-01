package paaalatine.logarithms;

import org.junit.Test;
import paaalatine.TestUtil;

public class LogarithmicFunctionTest {

    private TestUtil util = new TestUtil(new LogarithmicFunction());
    private final static double PRECISION = 1.0e-4;

    @Test
    public void negativeInfinity() {
        util.check(Double.NEGATIVE_INFINITY, PRECISION);
    }

    @Test
    public void positiveInfinity() {
        util.check(Double.POSITIVE_INFINITY, PRECISION);
    }

    @Test
    public void nan() {
        util.check(Double.NaN, PRECISION);
    }

    @Test
    public void beforeZero() {
        util.check(-0.01, PRECISION);
    }

    @Test
    public void zero() {
        util.check(0.0, PRECISION);
    }

    @Test
    public void afterZero() {
        util.check(0.01, PRECISION);
    }

    @Test
    public void beforeOne() {
        util.check(1 - 0.01, PRECISION);
    }

    @Test
    public void one() {
        util.check(1.0, PRECISION);
    }

    @Test
    public void afterOne() {
        util.check(1.0 + 0.01, PRECISION);
    }
}
