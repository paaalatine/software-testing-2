package paaalatine.logarithms;

import paaalatine.AbstractFunction;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;

public class LogarithmicFunction extends AbstractFunction {

    {
        table.put(POSITIVE_INFINITY, POSITIVE_INFINITY);

        table.put(0.0 - 0.01, Double.NaN);
        table.put(0.0, POSITIVE_INFINITY);
        table.put(0.0 + 0.01, 53.7846098097);

        table.put(1.0 - 0.01, 0.9814);
        table.put(1.0, NaN);
        table.put(1.0 + 0.01, 1.019);

        functionName = "logarithmic";
    }

    @Override
    public double getFunctionValue(double x) {
        if (x == POSITIVE_INFINITY) return x;
        if (x == 0) return POSITIVE_INFINITY;
        double l2 = new Log2().calculate(x);
        double l5 = new Log5().calculate(x);
        double l10 = new Log10().calculate(x);
        return Math.pow(((l2 / l2) * (l5 / l5)) + l2, 2) - (l10 * ((l2 / l5) - (l2 + l10)));
    }
}
