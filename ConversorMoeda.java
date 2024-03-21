public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.98F;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.printf("O valor de $%.2f em reais é de R$%.2f", valorDolar, valorReal);
    }


    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(100);
    }
}
