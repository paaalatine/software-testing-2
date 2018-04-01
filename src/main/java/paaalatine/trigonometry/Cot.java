package paaalatine.trigonometry;

import paaalatine.AbstractFunction;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.PI;

public class Cot extends AbstractFunction {

    {
        table.put(-PI, POSITIVE_INFINITY);
        table.put(-PI / 2, 0.0);
        table.put(0.0, POSITIVE_INFINITY);
        table.put(PI / 2, 0.0);
        table.put(PI, POSITIVE_INFINITY);

        table.put(3 * PI / 4, -1.0);
        table.put(-3 * PI / 4, 1.0);
        table.put( PI / 4, 1.0);
        table.put(-PI / 4, -1.0);

        functionName = "cot";
    }

    @Override
    public double getFunctionValue(double x) {
        double cos = new Cos().calculate(x);
        if ((x * 2 / PI) % 2 == 0) return POSITIVE_INFINITY;
        double result =  cos / Math.sqrt(1 - Math.pow(cos, 2));
        if(x < -PI / 2 && x > -PI || x < 0 && x > - PI / 2)
           result = -result;
        return result;
    }
}
