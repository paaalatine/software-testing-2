package paaalatine.logarithms;

import paaalatine.AbstractFunction;

public class Log5 extends AbstractFunction {

    {
        table.put(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        table.put(5.0 - 0.01, 0.99875608580);
        table.put(5.0, 1.0);
        table.put(5.0 + 0.01, 1.00124142885);

        table.put(0.0 - 0.01, Double.NaN);
        table.put(0.0, Double.NEGATIVE_INFINITY);
        table.put(0.0 + 0.01, -2.8613522213698093);

        table.put(1.0 - 0.01, -0.00624462477);
        table.put(1.0, 0.0);
        table.put(1.0 + 0.01, 0.00618248817);

        functionName = "log5";
    }

    @Override
    public double getFunctionValue(double x) {
        return LogN.log(x, 5);
    }
}
