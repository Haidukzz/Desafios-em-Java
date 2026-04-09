package Desafio.Conversor;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("o valor em reais é: R$" + valorReal);
    }
}
