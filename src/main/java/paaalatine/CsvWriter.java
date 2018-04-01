package paaalatine;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class CsvWriter {

    private AbstractFunction function;

    public CsvWriter(AbstractFunction function) {
        this.function = function;
    }

    private String generateFileName() {
        return function.functionName + " " + new Date().toString() + ".csv";
    }

    public void write(double from, double to, double step) {
        try (PrintStream out = new PrintStream(new FileOutputStream(generateFileName()), true)) {
            for (double i = from; i <= to; i += step)
                out.println(String.format("%f, %f", i, function.calculate(i)));
        } catch (Exception e) {}
    }
}
