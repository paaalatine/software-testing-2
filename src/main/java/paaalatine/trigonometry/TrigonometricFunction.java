package paaalatine.trigonometry;

import paaalatine.AbstractFunction;

import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.PI;

public class TrigonometricFunction extends AbstractFunction {

    {
        table.put(0.0 - 0.01, 1.0404645820385958e8);
        table.put(0.0, POSITIVE_INFINITY);
        table.put(0.0 + 0.01, 9.604685828585152e7);

        table.put(-9 * PI / 2 - 0.01, 6.25062e-26);
        table.put(-9 * PI / 2, 0.0);
        table.put(-9 * PI / 2 + 0.01, 6.25062e-26);

        table.put(7 * PI / 2 - 0.01, 6.25062e-26);
        table.put(7 * PI / 2, 0.0);
        table.put(7 * PI / 2 + 0.01, 6.25062e-26);

        table.put(-10.996 - 0.01, 1.03085e-25);
        table.put(-10.996, 0.0);
        table.put(-10.996 + 0.01, 3.70849e-26);

        table.put(7.854 - 0.01, 6.11424e-26);
        table.put(7.854, 0.0);
        table.put(7.854 + 0.01, 6.38978e-26);

        functionName = "trigonometric";
    }

    @Override
    public double getFunctionValue(double x) {
        if (x == NEGATIVE_INFINITY) return x;
        double cos = new Cos().calculate(x);
        double cot = new Cot().calculate(x);
        double tan = new Tan().calculate(x);
        if (tan == POSITIVE_INFINITY) tan = 0;
        return Math.pow(Math.pow(((cos - cot) + tan) - tan, 2), 2);
    }
}
