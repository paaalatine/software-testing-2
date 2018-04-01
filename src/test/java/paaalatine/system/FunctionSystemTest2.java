package paaalatine.system;

import org.junit.Before;
import org.junit.Test;
import paaalatine.TestUtil;
import paaalatine.logarithms.Ln;
import paaalatine.trigonometry.Cos;

public class FunctionSystemTest2 {
    private TestUtil util = new TestUtil(new FunctionSystem());
    private final static double PRECISION = 1e-4;

    @Before
    public void setUp() {
        Cos cos = new Cos();
        cos.setIsStub(true);
        Ln ln = new Ln();
        ln.setIsStub(true);
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
