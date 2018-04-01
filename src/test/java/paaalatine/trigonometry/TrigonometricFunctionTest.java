package paaalatine.trigonometry;

import org.junit.Test;
import paaalatine.TestUtil;

import static java.lang.Math.PI;

public class TrigonometricFunctionTest {
    private TestUtil util = new TestUtil(new TrigonometricFunction());
    private final static double PRECISION = 1e-4;

    @Test
    public void beforeZero() {
        util.check(-0.01, PRECISION);
    }

    @Test
    public void zero() {
        util.check(0, PRECISION);
    }

    @Test
    public void afterZero() {
        util.check(0.01, PRECISION);
    }

    @Test
    public void beforeExtrema1() {
        util.check(-10.996 - 0.01, PRECISION);
    }

    @Test
    public void extrema1() {
        util.check(-10.996, PRECISION);
    }

    @Test
    public void afterExtrema1() {
        util.check(-10.996 + 0.01, PRECISION);
    }

    @Test
    public void beforeExtrema2() {
        util.check(7 * PI / 2 - 0.01, PRECISION);
    }

    @Test
    public void extrema2() {
        util.check(7 * PI / 2, PRECISION);
    }

    @Test
    public void afterExtrema2() {
        util.check(7 * PI / 2 + 0.01, PRECISION);
    }

    @Test
    public void beforeExtrema3() {
        util.check(-9 * PI / 2 - 0.01, PRECISION);
    }

    @Test
    public void extrema3() {
        util.check(-9 * PI / 2, PRECISION);
    }

    @Test
    public void afterExtrema3() {
        util.check(-9 * PI / 2 + 0.01, PRECISION);
    }

    @Test
    public void beforeExtrema4() {
        util.check(7.854 - 0.01, PRECISION);
    }

    @Test
    public void extrema4() {
        util.check(7.854, PRECISION);
    }

    @Test
    public void afterExtrema4() {
        util.check(7.854 + 0.01, PRECISION);
    }
}
