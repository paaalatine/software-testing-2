package paaalatine.system;

import paaalatine.AbstractFunction;
import paaalatine.logarithms.LogarithmicFunction;
import paaalatine.trigonometry.TrigonometricFunction;

import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;

public class FunctionSystem extends AbstractFunction {

    {
        table.put(POSITIVE_INFINITY, POSITIVE_INFINITY);
        table.put(NEGATIVE_INFINITY, NEGATIVE_INFINITY);

        table.put(-10.996 - 0.01, 1.03085e-25);
        table.put(-10.996, 0.0);
        table.put(-10.996 + 0.01, 3.70849e-26);

        table.put(0.0 - 0.01, 1.0404645820385958e8);
        table.put(0.0, POSITIVE_INFINITY);
        table.put(0.0 + 0.01, 53.78468126785296);

        table.put(1.0 - 0.01, 0.9814);
        table.put(1.0, NaN);
        table.put(1.0 + 0.01, 1.019);

        functionName = "system";
    }

    @Override
    public double getFunctionValue(double x) {

        if (x <= 0) return new TrigonometricFunction().getFunctionValue(x);
        else return new LogarithmicFunction().getFunctionValue(x);
    }
}
