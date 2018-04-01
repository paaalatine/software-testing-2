package paaalatine;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractFunction {

    protected static final int MAX_ITERATIONS = 1_000_000;

    private double esp = 1e-10;

    protected String functionName;

    private static Map<String, Boolean> functionsIsStub = new HashMap<>();
    protected Map<Double, Double> table = new HashMap<>();

    public void setIsStub(boolean isStub) {
        functionsIsStub.put(functionName, isStub);
    }

    public double getEsp() {
        return esp;
    }

    public double calculate(double x) {
        Boolean isStub;
        if((isStub = functionsIsStub.get(functionName)) == null) {
            isStub = false;
        }
        if(isStub)
            return stub(x);
        else
            return getFunctionValue(x);
    }

    protected double stub(double x) {
        Double result;
        if((result = table.get(x)) != null)
            return result;
        else
            return Double.NaN;
    }

    public abstract double getFunctionValue(double x);
}
