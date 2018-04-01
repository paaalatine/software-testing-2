package paaalatine.system;

import org.junit.Before;
import org.junit.Test;
import paaalatine.TestUtil;
import paaalatine.logarithms.LogarithmicFunction;
import paaalatine.trigonometry.TrigonometricFunction;

public class FunctionSystemTest3 {
    private TestUtil util = new TestUtil(new FunctionSystem());
    private final static double PRECISION = 1e-4;

    @Before
    public void setUp() {
        TrigonometricFunction trigonometricFunction = new TrigonometricFunction();
        trigonometricFunction.setIsStub(true);
        LogarithmicFunction logarithmicFunction = new LogarithmicFunction();
        logarithmicFunction.setIsStub(true);
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
