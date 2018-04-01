package paaalatine.logarithms;

import paaalatine.AbstractFunction;

public class Log10 extends AbstractFunction {

    {
        table.put(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        table.put(10.0 - 0.01, 0.999565);
        table.put(10.0, 1.0);
        table.put(10.0 + 0.01, 1.00043);

        table.put(0.0 - 0.01, Double.NaN);
        table.put(0.0, Double.NEGATIVE_INFINITY);
        table.put(0.0 + 0.01, -2.0);

        table.put(1.0 - 0.01, -0.00436481);
        table.put(1.0, 0.0);
        table.put(1.0 + 0.01, 0.00432137);

        functionName = "log10";
    }

    @Override
    public double getFunctionValue(double x) {
        return LogN.log(x, 10);
    }
}
