public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double tempCelsius) {
        double tempCelFah = (tempCelsius * 1.8F) + 32;
        System.out.printf("A temperatura %.2f ºC em Fahrenheit é %.2f F\n", tempCelsius, tempCelFah);
    }

    @Override
    public void fahrenheitParaCelsius(double  tempFahrenheit) {
        double tempFahCel = (tempFahrenheit - 32) / 1.8F;
        System.out.printf("A temperatura %.2f F em Celsius é %.2f ºC\n", tempFahrenheit, tempFahCel);
    }


    public static void main(String[] args) {
        ConversorTemperaturaPadrao termometro = new ConversorTemperaturaPadrao();

        termometro.celsiusParaFahrenheit(35.6F);
        termometro.fahrenheitParaCelsius(108.7);
    }
}
