package br.com.gcp.functions;

import java.math.BigDecimal;
import java.util.function.Function;

public class CalculateNumbers implements Function<CalculateNumbers.Calculate, BigDecimal> {

    @Override
    public BigDecimal apply(Calculate calculate) {
        switch (calculate.operation){
            case SUM: return calculate.number1.add(calculate.number2);
            case SUBTRACT: return calculate.number1.subtract(calculate.number2);
            case MULTIPLY: return calculate.number1.multiply(calculate.number2);
            case DIVIDE: return calculate.number1.divide(calculate.number2);
            default: return BigDecimal.ZERO;
        }
    }

    class Calculate {
        public BigDecimal number1;
        public BigDecimal number2;
        public Operation operation;
    }

    enum Operation {
        SUM, SUBTRACT, MULTIPLY, DIVIDE
    }
}
