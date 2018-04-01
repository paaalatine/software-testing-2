package paaalatine.logarithms;

import paaalatine.AbstractFunction;

import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;

public class Ln extends AbstractFunction {

    {
        table.put(POSITIVE_INFINITY, POSITIVE_INFINITY);
        table.put(Math.E - 0.01, 0.996314422);
        table.put(Math.E, 1.0);
        table.put(Math.E + 0.01, 1.003672044);

        table.put(0.0 - 0.01, NaN);
        table.put(0.0, NEGATIVE_INFINITY);
        table.put(0.0 + 0.01, -4.60517018598);

        table.put(1.0 - 0.01, -0.010050000000000009);
        table.put(1.0, 0.0);
        table.put(1.0 + 0.01, 0.00995000000000001);

        table.put(2.0, 0.6931471805);
        table.put(5.0, 1.6094379124);
        table.put(10.0, 2.3025850930);

        functionName = "ln";
    }

    @Override
    public double getFunctionValue(double x) {

        if (Double.isNaN(x) || x < 0.0)
            return NaN;
        if (x == 0.0)
            return NEGATIVE_INFINITY;
        if (x == POSITIVE_INFINITY)
            return x;

        double currentSum = 0, previousSum;

        int n = 1;
        int k = 1;
        if (Math.abs(x - 1) <= 1) {
            do {
                previousSum = currentSum;
                currentSum -= ((Math.pow(-1, n) * Math.pow(x - 1, n)) / n);
                n++;
            } while ((Math.abs(currentSum - previousSum)) > getEsp() && n < MAX_ITERATIONS);
        } else {
            do {
                previousSum = currentSum;
                currentSum -= ((Math.pow(-1, k) * Math.pow(x - 1, -k)) / k);
                k++;
            } while ((Math.abs(currentSum - previousSum)) > getEsp() && n < MAX_ITERATIONS);
            currentSum += getFunctionValue(x - 1);
        }
        return currentSum;
    }

}
