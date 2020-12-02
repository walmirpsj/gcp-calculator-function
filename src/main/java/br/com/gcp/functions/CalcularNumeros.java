package br.com.gcp.functions;

import java.math.BigDecimal;
import java.util.function.Function;

public class CalcularNumeros implements Function<CalcularNumeros.Calcular, BigDecimal> {

    @Override
    public BigDecimal apply(Calcular calcular) {
        switch (calcular.operacao){
            case SOMAR: return calcular.numero1.add(calcular.numero2);
            case SUBTRAIR: return calcular.numero1.subtract(calcular.numero2);
            case MULTIPLICAR: return calcular.numero1.multiply(calcular.numero2);
            case DIVIDIR: return calcular.numero1.divide(calcular.numero2);
            default: return BigDecimal.ZERO;
        }
    }

    class Calcular{
        public BigDecimal numero1;
        public BigDecimal numero2;
        public Operacao operacao;
    }

    enum Operacao{
        SOMAR, SUBTRAIR, MULTIPLICAR, DIVIDIR
    }
}
