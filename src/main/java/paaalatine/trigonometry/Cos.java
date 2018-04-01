package paaalatine.trigonometry;

import paaalatine.AbstractFunction;

import static java.lang.Math.PI;

public class Cos extends AbstractFunction {
    public static final int MAX_ITERATIONS = 1_000_000;

    {
        table.put(-PI, -1.0);
        table.put(-PI / 2, 0.0);
        table.put(0.0, 1.0);
        table.put(PI / 2, 0.0);
        table.put(PI, -1.0);

        table.put(3 * PI / 4, -0.707106781);
        table.put(-3 * PI / 4, -0.707106781);
        table.put( PI / 4, 0.707106781);
        table.put(-PI / 4, 0.707106781);

        functionName = "cos";
    }

    private static double calibrate(double x) {
        double del = PI * 2;
        if (x < 0)
            del *= -1;
        while (Math.abs(x) > 6.0)
            x -= del;
        return x;
    }

    @Override
    public double getFunctionValue(double x) {

        x = calibrate(x);

        int n = 1;
        double mult = x * x;
        double fact = 2;
        double sign = 1;
        int factS = 4;
        double currentSum = 1 - mult/fact, previousSum;

        do {
            previousSum = currentSum;
            mult *= x * x;
            fact *= factS * (factS - 1);
            factS += 2;
            currentSum += sign * (mult / fact);
            sign *= -1;
            n++;
        } while ((Math.abs(currentSum - previousSum)) > getEsp() && n < MAX_ITERATIONS);

        return currentSum;
    }
}
