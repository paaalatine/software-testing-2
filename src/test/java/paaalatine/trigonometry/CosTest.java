package paaalatine.trigonometry;

import org.junit.Test;
import paaalatine.CsvWriter;
import paaalatine.TestUtil;

import static java.lang.Math.PI;

public class CosTest {

    private final static double PRECISION = 1.0e-5;
    TestUtil util = new TestUtil(new Cos());

    @Test
    public void pi() {
        util.check(PI, PRECISION);
    }

    @Test
    public void halfPi() {
        util.check(PI / 2, PRECISION);
    }

    @Test
    public void minusHalfPi() {
        util.check(-PI / 2, PRECISION);
    }

    @Test
    public void zero() {
        util.check(0, PRECISION);
    }

    @Test
    public void minusPiToMinusHalfPi() {
        util.checkRange(-PI, -PI / 2, PI / 4, PRECISION);
    }

    @Test
    public void minusHalfPiToZero() {
        util.checkRange(-PI / 2, 0, PI / 4, PRECISION);
    }

    @Test
    public void zeroToHalfPi() {
        util.checkRange(0, PI / 2, PI / 4, PRECISION);
    }

    @Test
    public void halfPiToPi() {
        util.checkRange(PI / 2, PI, PI / 4, PRECISION);
    }

    @Test
    public void writeCsv() {
        CsvWriter cvsWriter = new CsvWriter(new Cos());
        cvsWriter.write(-10, 10, 1);
    }
}
