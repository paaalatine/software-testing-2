package paaalatine.system;

import org.junit.Before;
import org.junit.Test;
import paaalatine.TestUtil;
import paaalatine.logarithms.Log10;
import paaalatine.logarithms.Log2;
import paaalatine.logarithms.Log5;

public class FunctionSystemTest5 {
    private TestUtil util = new TestUtil(new FunctionSystem());
    private final static double PRECISION = 1e-4;

    @Before
    public void setUp() {
        Log2 log2 = new Log2();
        log2.setIsStub(true);
        Log5 log5 = new Log5();
        log5.setIsStub(true);
        Log10 log10 = new Log10();
        log10.setIsStub(true);
    }

    @Test
    public void negativeInfinity(){
        util.check(Double.NEGATIVE_INFINITY, PRECISION);
    }

    @Test
    public void positiveInfinity(){
        util.check(Double.POSITIVE_INFINITY, PRECISION);
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
}
