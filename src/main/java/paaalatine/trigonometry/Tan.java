package paaalatine.trigonometry;

import paaalatine.AbstractFunction;

import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.PI;

public class Tan extends AbstractFunction {

    {
        table.put(-PI, 0.0);
        table.put(-PI / 2, POSITIVE_INFINITY);
        table.put(0.0, 0.0);
        table.put(PI / 2, POSITIVE_INFINITY);
        table.put(PI, 0.0);

        table.put(3 * PI / 4, -1.0);
        table.put(-3 * PI / 4, 1.0);
        table.put( PI / 4, 1.0);
        table.put(-PI / 4, -1.0);

        table.put(-PI * 1.5, POSITIVE_INFINITY);
        table.put(-PI * 1.5 + PI / 16, -5.027339481844);
        table.put(-PI * 1.5 + 2 * PI / 16, -2.414214618296);

        functionName = "tan";
    }

    @Override
    public double getFunctionValue(double x) {

        if ((x * 2 / PI) % 2 == 1 || (x * 2 / PI) % 2 == -1) return POSITIVE_INFINITY;
        double cos = new Cos().calculate(x);

        double result = Math.sqrt(Math.abs(1 - 1 / Math.pow(cos, 2)));

        if(x > -PI / 2 && x < 0 || x > PI / 2 && x < PI)
            result = -result;
        return result;
    }
}
