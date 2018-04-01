package paaalatine.system;

import org.junit.Test;
import paaalatine.TestUtil;

public class FunctionSystemTest1 {
    private TestUtil util = new TestUtil(new FunctionSystem());
    private final static double PRECISION = 1e-4;

    @Test
    public void negativeInfinity(){
        util.check(Double.NEGATIVE_INFINITY, PRECISION);
    }

    @Test
    public void positiveInfinity(){
        util.check(Double.POSITIVE_INFINITY, PRECISION);
    }

    @Test
    public void beforeZero() {
        util.check(0.0 - 0.01, PRECISION);
    }

    @Test
    public void zero() {
        util.check(0.0, PRECISION);
    }

    @Test
    public void afterZero() {
        util.check(0.0 + 0.01, PRECISION);
    }

    @Test
    public void beforeOne() {
        util.check(1.0 - 0.01, PRECISION);
    }

    @Test
    public void one() {
        util.check(1.0, PRECISION);
    }

    @Test
    public void afterOne() {
        util.check(1.0 + 0.01, PRECISION);
    }

    @Test
    public void beforeTrigonometryExtrema() {
        util.check(-10.996 - 0.01, PRECISION);
    }

    @Test
    public void trigonometryExtrema() {
        util.check(-10.996, PRECISION);
    }

    @Test
    public void afterTrigonometryExtrema() {
        util.check(-10.996 + 0.01, PRECISION);
    }
}
