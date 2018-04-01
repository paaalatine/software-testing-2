package paaalatine.logarithms;

import paaalatine.AbstractFunction;

public class Log2 extends AbstractFunction {

    {
        table.put(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        table.put(2.0 - 0.01, 0.992768);
        table.put(2.0, 1.0);
        table.put(2.0 + 0.01, 1.00720);

        table.put(0.0 - 0.01, Double.NaN);
        table.put(0.0, Double.NEGATIVE_INFINITY);
        table.put(0.0 + 0.01, -6.6438513838488);

        table.put(1.0 - 0.01, -0.0144996);
        table.put(1.0, 0.0);
        table.put(1.0 + 0.01, 0.0143553);

        functionName = "log2";
    }


    @Override
    public double getFunctionValue(double x) {
        return LogN.log(x,2);
    }
}
