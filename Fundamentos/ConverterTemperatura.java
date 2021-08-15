package Fundamentos;

public class ConverterTemperatura {
    public static void main(String[] args) {

        final int ajuste = 32;
        final double fator = 5/9.0;

        double Fahrenheit = 86;
        double Celsius = 0;

        /*(F-32) */
        Celsius = (Fahrenheit - ajuste) * fator;

        System.out.println("A conversão de " + Fahrenheit + "ºF" + " para Celsius é " + Celsius + "ºC");

    }
}
